package com.oulim.app.admin.dto;

public class AdminPostListDTO {

	
//	게시판 조회
//	POST_NO NUMBER
//	USER_NO NUMBER
//	USER_NICKNAME VARCHAR2
//	POST_TITLE VARCHAR2
//	POST_DATE DATE
//	POST_LIKE_NO NUMBER
//	POST_VIEW_COUNT NUMBER
//	=========
//	관리자 권한
//	select
//	delete
	private int postNo;
	private int userNo;
	private String nickName;
	private String postTitle;
	private int postDate;
	private int postLikeNo;
	private int postViewCount;
	
	
	/**
	 * @return the postNo
	 */
	public int getPostNo() {
		return postNo;
	}
	/**
	 * @param postNo the postNo to set
	 */
	public void setPostNo(int postNo) {
		this.postNo = postNo;
	}
	/**
	 * @return the userNo
	 */
	public int getUserNo() {
		return userNo;
	}
	/**
	 * @param userNo the userNo to set
	 */
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	/**
	 * @return the nickName
	 */
	public String getNickName() {
		return nickName;
	}
	/**
	 * @param nickName the nickName to set
	 */
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	/**
	 * @return the postTitle
	 */
	public String getPostTitle() {
		return postTitle;
	}
	/**
	 * @param postTitle the postTitle to set
	 */
	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}
	/**
	 * @return the postDate
	 */
	public int getPostDate() {
		return postDate;
	}
	/**
	 * @param postDate the postDate to set
	 */
	public void setPostDate(int postDate) {
		this.postDate = postDate;
	}
	/**
	 * @return the postLikeNo
	 */
	public int getPostLikeNo() {
		return postLikeNo;
	}
	/**
	 * @param postLikeNo the postLikeNo to set
	 */
	public void setPostLikeNo(int postLikeNo) {
		this.postLikeNo = postLikeNo;
	}
	/**
	 * @return the postViewCount
	 */
	public int getPostViewCount() {
		return postViewCount;
	}
	/**
	 * @param postViewCount the postViewCount to set
	 */
	public void setPostViewCount(int postViewCount) {
		this.postViewCount = postViewCount;
	}
	@Override
	public String toString() {
		return "AdminBoardDTO [postNo=" + postNo + ", userNo=" + userNo + ", nickName=" + nickName + ", postTitle="
				+ postTitle + ", postDate=" + postDate + ", postLikeNo=" + postLikeNo + ", postViewCount="
				+ postViewCount + "]";
	}

}