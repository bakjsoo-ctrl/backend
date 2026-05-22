package com.oulim.app.community.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oulim.app.common.controller.Execute;
import com.oulim.app.common.controller.Result;
import com.oulim.app.common.util.BasePagenation;
import com.oulim.app.common.util.DefineType;
import com.oulim.app.community.dao.CommunityDAO;
import com.oulim.app.community.dao.CommunityFileDAO;
import com.oulim.app.community.dto.CommunityCommentDTO;
import com.oulim.app.community.dto.CommunityPostJoinDTO;
import com.oulim.app.community.dto.PostImageDTO;

public class CommunityReadOkController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("CommunityReadOkController 입장");
		
		Result result = new Result();
		
		String postNoStr = request.getParameter("postNo");
		if(postNoStr == null || postNoStr.trim().isEmpty()) {
			System.out.println("postNo 값이 없습니다.");
			result.setPath("/app/community/community-list.jsp");
			result.setRedirect(true);
			return result;
		}
		
		int postNo = Integer.parseInt(postNoStr);
		CommunityDAO commuDAO = new CommunityDAO();
		CommunityFileDAO commuFileDAO = new CommunityFileDAO();
		
		// DB에서 게시글 가져오기
		CommunityPostJoinDTO postJoinDTO = commuDAO.selectPostDetail(postNo);
		
		if(postJoinDTO == null) {
			System.out.println("존재하지 않는 게시글입니다." + postNo);
			result.setPath("/app/community/community-list.jsp");
			result.setRedirect(true);
			return result;
		}
		
		// 첨부파일 가져오기
		List<PostImageDTO> imageList = commuFileDAO.select(postNo);
	      System.out.println("==파일 확인==");
	      System.out.println(imageList);
	      System.out.println("===========");
	      
	    postJoinDTO.setImages(imageList);	 
	    int totalComment = commuDAO.getTotalComment(postNo);
	    int page = 1;
	    
	    BasePagenation pagenation = new BasePagenation(page, totalComment);
	    
		Map<String, Integer> rowMap = new HashMap<>();
		rowMap.put("postNo", postNo);
		rowMap.put("limit", pagenation.getLimit());
		rowMap.put("offset", pagenation.getOffset());
	    // 댓글 가져오기
	    List<CommunityCommentDTO> commentList = commuDAO.selectCommentList(rowMap);
	    request.setAttribute("commentList", commentList);
	    
	    int startPage = pagenation.getStartPage();
	    int endPage = pagenation.getEndPage();

		
		boolean prev = pagenation.getIsPrev();
		boolean next = pagenation.getIsNext();
		
		request.setAttribute("page", page);
		request.setAttribute("startPage", startPage);
		request.setAttribute("endPage", endPage);
		request.setAttribute("prev", prev);
		request.setAttribute("next", next);
		
	    Integer loginUserNo = (Integer) request.getSession().getAttribute("userNo");
	    System.out.println("로그인 유저 번호");
	    
	    Integer writeUserNo = postJoinDTO.getUserNo();
	    System.out.println("작성자 유저 번호");
	    
	    
	   	if(!Objects.equals(writeUserNo, loginUserNo)) {
	   		commuDAO.updateViewCount(postNo);	   		
	   		postJoinDTO.setPostViewCount(postJoinDTO.getPostViewCount() + 1);
	   	}
	   	
	   	request.setAttribute("post", postJoinDTO);
	   	result.setPath("/app/community/community-detail.jsp");
	   	result.setRedirect(false);
		return result;
	}
	
}
