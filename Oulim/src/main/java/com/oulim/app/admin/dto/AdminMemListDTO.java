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
	  
    // 목록 출력용
    private int userNo;               // 유저번호
    private String userId;            // 아이디
    private String userNickname;      // 닉네임
    private String userName;          // 이름
    private int userType;             // 회원종류 원본값
    
    private String userTypeText;      // 회원종류 화면출력용

    // 검색용
    private String searchType;        // userNo, userId, userNickname, userType, userName
    private String keyword;           // 검색어

    // 페이징용
    private int startRow;
    private int endRow;
    
    
	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserType() {
		return userType;
	}
	public void setUserType(int userType) {
		this.userType = userType;
	}
	public String getUserTypeText() {
		return userTypeText;
	}
	public void setUserTypeText(String userTypeText) {
		this.userTypeText = userTypeText;
	}
	public String getSearchType() {
		return searchType;
	}
	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public int getStartRow() {
		return startRow;
	}
	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}
	public int getEndRow() {
		return endRow;
	}
	public void setEndRow(int endRow) {
		this.endRow = endRow;
	}
	@Override
	public String toString() {
		return "AdminMemListDTO [userNo=" + userNo + ", userId=" + userId + ", userNickname=" + userNickname
				+ ", userName=" + userName + ", userType=" + userType + ", userTypeText=" + userTypeText
				+ ", searchType=" + searchType + ", keyword=" + keyword + ", startRow=" + startRow + ", endRow="
				+ endRow + "]";
	}

	  
	  
	  
	  
	  
	  
	  
	  
	  
}
