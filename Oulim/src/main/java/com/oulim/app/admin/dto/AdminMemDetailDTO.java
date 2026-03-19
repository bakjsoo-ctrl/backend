package com.oulim.app.admin.dto;

public class AdminMemDetailDTO {

//	사용자이름
//	아이디
//	닉네임 (수정가능) 중복확인버튼
//	주소 
//	포인트(상세보기버튼)
//	수정탈퇴버튼
	
	
//	User_Name VARCHAR2(20) NOT NULL,
//	 User_ID VARCHAR2(20) NOT NULL UNIQUE,
//	  User_Nickname VARCHAR2(20) NULL UNIQUE,
//	  User_Address VARCHAR2(50),
//	  Total_Amount NUMBER DEFAULT 0 NOT NULL,
	 
		private String userName;
		private String userID;
		private String userNickname;
		private String userAddress;
		private int totalAmount;
	 
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
		 * @return the userID
		 */
		private String getUserID() {
			return userID;
		}
		/**
		 * @param userID the userID to set
		 */
		private void setUserID(String userID) {
			this.userID = userID;
		}
		/**
		 * @return the userNickname
		 */
		private String getUserNickname() {
			return userNickname;
		}
		/**
		 * @param userNickname the userNickname to set
		 */
		private void setUserNickname(String userNickname) {
			this.userNickname = userNickname;
		}
		/**
		 * @return the userAddress
		 */
		private String getUserAddress() {
			return userAddress;
		}
		/**
		 * @param userAddress the userAddress to set
		 */
		private void setUserAddress(String userAddress) {
			this.userAddress = userAddress;
		}
		/**
		 * @return the totalAmount
		 */
		private int getTotalAmount() {
			return totalAmount;
		}
		/**
		 * @param totalAmount the totalAmount to set
		 */
		private void setTotalAmount(int totalAmount) {
			this.totalAmount = totalAmount;
		}
	 
		@Override
		public String toString() {
			return "AdminMemDetailDTO [userName=" + userName + ", userID=" + userID + ", userNickname=" + userNickname
					+ ", userAddress=" + userAddress + ", totalAmount=" + totalAmount + "]";
		}
	 
	 
	 
	 
	 
	
	
}
