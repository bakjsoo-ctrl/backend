package com.oulim.app.admin.dto;

import java.time.LocalDate;

public class AdminCompanyDetailDTO {

//	기관명
//	이름
//	생년월일
//	사업자등록번호
//	이메일
//	주소
//	재직증명서(파일)다운
//	사업자등록증(파일)다운
//	===
//	승인반려버튼
	
//	  Organ_Name VARCHAR2(50) NOT NULL,
//	  User_Name VARCHAR2(20) NOT NULL,
//	  User_Birth DATE NOT NULL,
//	  Organ_Cert_No NUMBER
//	  User_Email VARCHAR2(50) NOT NULL UNIQUE,
//	  User_Address VARCHAR2(50),
//	  User_No NUMBER NOT NULL,
//	  Organ_No NUMBER,
//	  Organ_File_System_Name VARCHAR2(300) NOT NULL,
//	  Organ_File_Original_Name VARCHAR2(300) NOT NULL,
//	


private String organName;
private String userName;
private LocalDate userBirth;
private int organCertNo;
private String userEmail;
private String userAddress;
private int userNo;
private int organNo;
private String organFileSystemName;
private String organFileOriginalName;


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
 * @return the userBirth
 */
private LocalDate getUserBirth() {
	return userBirth;
}
/**
 * @param userBirth the userBirth to set
 */
private void setUserBirth(LocalDate userBirth) {
	this.userBirth = userBirth;
}
/**
 * @return the organCertNo
 */
private int getOrganCertNo() {
	return organCertNo;
}
/**
 * @param organCertNo the organCertNo to set
 */
private void setOrganCertNo(int organCertNo) {
	this.organCertNo = organCertNo;
}
/**
 * @return the userEmail
 */
private String getUserEmail() {
	return userEmail;
}
/**
 * @param userEmail the userEmail to set
 */
private void setUserEmail(String userEmail) {
	this.userEmail = userEmail;
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
/**
 * @return the organFileSystemName
 */
private String getOrganFileSystemName() {
	return organFileSystemName;
}
/**
 * @param organFileSystemName the organFileSystemName to set
 */
private void setOrganFileSystemName(String organFileSystemName) {
	this.organFileSystemName = organFileSystemName;
}
/**
 * @return the organFileOriginalName
 */
private String getOrganFileOriginalName() {
	return organFileOriginalName;
}
/**
 * @param organFileOriginalName the organFileOriginalName to set
 */
private void setOrganFileOriginalName(String organFileOriginalName) {
	this.organFileOriginalName = organFileOriginalName;
}


@Override
public String toString() {
	return "AdminCompanyDetailDTO [organName=" + organName + ", userName=" + userName + ", userBirth=" + userBirth
			+ ", organCertNo=" + organCertNo + ", userEmail=" + userEmail + ", userAddress=" + userAddress + ", userNo="
			+ userNo + ", organNo=" + organNo + ", organFileSystemName=" + organFileSystemName
			+ ", organFileOriginalName=" + organFileOriginalName + "]";
}


}
