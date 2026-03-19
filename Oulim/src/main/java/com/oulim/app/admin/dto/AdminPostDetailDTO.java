package com.oulim.app.admin.dto;

import java.sql.Date;
import java.time.LocalDate;

public class AdminPostDetailDTO {

//	후기제목
//	작성일
//	닉네임
//	조회수
//	추천수
//	==
//	그림파일
//	텍스트
//	==
//	댓글목록
//	댓글작성자
//	===
//	삭제버튼
	
//	  Post_Title VARCHAR2(100) NOT NULL,
//	  Post_Date DATE DEFAULT SYSDATE NOT NULL,
//	  User_Nickname VARCHAR2(20),
//	  Post_View_Count NUMBER DEFAULT 0 NOT NULL,
//	  Post_Like_No NUMBER,
//	  COMMENT_Content VARCHAR2(100) NOT NULL,
//	  User_No NUMBER,
//	  
	
		private String postTitle;
		private Date postDate;
		private String userNicname;
		private int postViewCount;
		private int postLike;
		private String commentContent;
		private int userNo;
		public String getPostTitle() {
			return postTitle;
		}
		public void setPostTitle(String postTitle) {
			this.postTitle = postTitle;
		}
		public Date getPostDate() {
			return postDate;
		}
		public void setPostDate(Date postDate) {
			this.postDate = postDate;
		}
		public String getUserNicname() {
			return userNicname;
		}
		public void setUserNicname(String userNicname) {
			this.userNicname = userNicname;
		}
		public int getPostViewCount() {
			return postViewCount;
		}
		public void setPostViewCount(int postViewCount) {
			this.postViewCount = postViewCount;
		}
		public int getPostLike() {
			return postLike;
		}
		public void setPostLike(int postLike) {
			this.postLike = postLike;
		}
		public String getCommentContent() {
			return commentContent;
		}
		public void setCommentContent(String commentContent) {
			this.commentContent = commentContent;
		}
		public int getUserNo() {
			return userNo;
		}
		public void setUserNo(int userNo) {
			this.userNo = userNo;
		}
		@Override
		public String toString() {
			return "AdminPostDetailDTO [postTitle=" + postTitle + ", postDate=" + postDate + ", userNicname="
					+ userNicname + ", postViewCount=" + postViewCount + ", postLike=" + postLike + ", commentContent="
					+ commentContent + ", userNo=" + userNo + "]";
		}
		



}
