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
	 
    // 회원 기본 정보
    private int userNo;                  // 회원번호
    private String userName;             // 이름
    private String userId;               // 아이디
    private String userNickname;         // 닉네임
    private String userAddress;          // 주소
    private String userAddressDetail;    // 상세주소

    // 포인트 정보
    private int totalAmount;             // 보유포인트

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserNickname() {
		return userNickname;
	}

	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserAddressDetail() {
		return userAddressDetail;
	}

	public void setUserAddressDetail(String userAddressDetail) {
		this.userAddressDetail = userAddressDetail;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	@Override
	public String toString() {
		return "AdminMemDetailDTO [userNo=" + userNo + ", userName=" + userName + ", userId=" + userId
				+ ", userNickname=" + userNickname + ", userAddress=" + userAddress + ", userAddressDetail="
				+ userAddressDetail + ", totalAmount=" + totalAmount + "]";
	}
	 
	 
	 
	
	
}
