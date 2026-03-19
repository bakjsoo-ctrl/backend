package com.oulim.app.admin.dto;

public class AdminMemListDTO {

// 유저번호
// 아이디
// 닉네임
// 이름
// 회원종류
//	선택창 검색창 조회버튼
//	페이지네이션
//	선택시 유저이동
	
	
//	  User_No NUMBER,
//	  User_ID VARCHAR2(20) NOT NULL UNIQUE,
//	  User_Nickname VARCHAR2(20) NULL UNIQUE,
//	  User_Name VARCHAR2(20) NOT NULL,
//	  User_Type NUMBER(1) NOT NULL,
	  
		private int userNo;
		private String userId;
		private String nickName;
		private String userName;
		private int userType;
	  
		
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
		/**
		 * @return the userId
		 */
		private String getUserId() {
			return userId;
		}
		/**
		 * @param userId the userId to set
		 */
		private void setUserId(String userId) {
			this.userId = userId;
		}
		/**
		 * @return the nickName
		 */
		private String getNickName() {
			return nickName;
		}
		/**
		 * @param nickName the nickName to set
		 */
		private void setNickName(String nickName) {
			this.nickName = nickName;
		}
		/**
		 * @return the userName
		 */
		private String getUserName() {
			return userName;
		}
		/**
		 * @param userName the userName to set
		 */
		private void setUserName(String userName) {
			this.userName = userName;
		}
		/**
		 * @return the userType
		 */
		private int getUserType() {
			return userType;
		}
		/**
		 * @param userType the userType to set
		 */
		private void setUserType(int userType) {
			this.userType = userType;
		}

	  
		@Override
		public String toString() {
			return "AdminMemListDTO [userNo=" + userNo + ", userId=" + userId + ", nickName=" + nickName + ", userName="
					+ userName + ", userType=" + userType + "]";
		}
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
}
