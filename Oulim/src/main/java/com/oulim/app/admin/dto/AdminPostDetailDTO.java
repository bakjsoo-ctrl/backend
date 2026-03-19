package com.oulim.app.admin.dto;

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
		private LocalDate postDate;
		private String userNicname;
		private int postViewCount;
		private int postLike;
		private String commentContent;
		private int userNo;
		
		/**
		 * @return the postTitle
		 */
		private String getPostTitle() {
			return postTitle;
		}
		/**
		 * @param postTitle the postTitle to set
		 */
		private void setPostTitle(String postTitle) {
			this.postTitle = postTitle;
		}
		/**
		 * @return the postDate
		 */
		private LocalDate getPostDate() {
			return postDate;
		}
		/**
		 * @param postDate the postDate to set
		 */
		private void setPostDate(LocalDate postDate) {
			this.postDate = postDate;
		}
		/**
		 * @return the userNicname
		 */
		private String getUserNicname() {
			return userNicname;
		}
		/**
		 * @param userNicname the userNicname to set
		 */
		private void setUserNicname(String userNicname) {
			this.userNicname = userNicname;
		}
		/**
		 * @return the postViewCount
		 */
		private int getPostViewCount() {
			return postViewCount;
		}
		/**
		 * @param postViewCount the postViewCount to set
		 */
		private void setPostViewCount(int postViewCount) {
			this.postViewCount = postViewCount;
		}
		/**
		 * @return the postLike
		 */
		private int getPostLike() {
			return postLike;
		}
		/**
		 * @param postLike the postLike to set
		 */
		private void setPostLike(int postLike) {
			this.postLike = postLike;
		}
		/**
		 * @return the commentContent
		 */
		private String getCommentContent() {
			return commentContent;
		}
		/**
		 * @param commentContent the commentContent to set
		 */
		private void setCommentContent(String commentContent) {
			this.commentContent = commentContent;
		}
		/**
		 * @return the userNo
		 */
		private int getUserNo() {
			return userNo;
		}
		/**
		 * @param userNo the userNo to set
		 */
		private void setUserNo(int userNo) {
			this.userNo = userNo;
		}
		
		@Override
		public String toString() {
			return "AdminPostDetailDTO [postTitle=" + postTitle + ", postDate=" + postDate + ", userNicname="
					+ userNicname + ", postViewCount=" + postViewCount + ", postLike=" + postLike + ", commentContent="
					+ commentContent + ", userNo=" + userNo + "]";
		}


}
