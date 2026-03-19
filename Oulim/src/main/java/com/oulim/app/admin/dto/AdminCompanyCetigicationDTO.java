package com.oulim.app.admin.dto;

public class AdminCompanyCetigicationDTO {
//	유저번호
//	회사명
//	아이디
//	가입일
//	회사코드
//	====
//	체크박스
//	페이지네이션
//	승인반려버튼
//	UserNo NUMBER
//	OrganName VARCHAR2
//	UserID varchar2
//	
//	  Organ_No NUMBER
	
	private int userNo;
	private String organName;
	private String userId;
	private int organNo;
	
	
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
	 * @return the organName
	 */
	private String getOrganName() {
		return organName;
	}
	/**
	 * @param organName the organName to set
	 */
	private void setOrganName(String organName) {
		this.organName = organName;
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
	 * @return the organNo
	 */
	private int getOrganNo() {
		return organNo;
	}
	/**
	 * @param organNo the organNo to set
	 */
	private void setOrganNo(int organNo) {
		this.organNo = organNo;
	}
	
	@Override
	public String toString() {
		return "AdminCompanyCetigicationDTO [userNo=" + userNo + ", organName=" + organName + ", userId=" + userId
				+ ", organNo=" + organNo + "]";
	}
}
