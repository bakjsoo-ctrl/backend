package com.oulim.app.admin.dto;

import java.time.LocalDate;

public class AdminVolunDetailDTO {

//	모집상태
//	봉사주제  Volun_Act_Title VARCHAR2(50) NOT NULL,
//	봉사시간 	Volun_Act_Begin_Time NUMBER(2) NOT NULL,
//			Volun_Act_End_Time NUMBER(2) NOT NULL,
//	봉사장소   Volun_Act_Address VARCHAR2(50) NOT NULL,
//	봉사기간   Volun_Act_Proc_Begin DATE NOT NULL,
//	  		Volun_Act_Proc_End DATE NOT NULL,
//	모집기간  Volun_Act_Recru_Begin DATE NOT NULL,
//			Volun_Act_Recru_End DATE NOT NULL,
//	모집인원  Volun_Act_Recru_Max_Count NUMBER(2) NOT NULL,
//	포인트  	Volun_Act_Point NUMBER NOT NULL,
//	봉사자 연령  Volun_Act_Age_Group NUMBER(1) NOT NULL,
//			  Volun_Act_Act_Type NUMBER(2) NOT NULL,
//참가자목록(삭제버튼) VolunAct_ApplyStatus NUMBER(1) DEFAULT 1 NOT NULL,
//			      User_Name VARCHAR2(20) NOT NULL,
//				=====
//				페이지네이션	  
  
	private String volunActTitle;
	private int volunActBeginTime;
	private int volunActEndTime;
	private String volunActAddress;
	private LocalDate volunActProcBegin;
	private LocalDate volunActProcEnd;
	private LocalDate volunActRecruBegin;
	private LocalDate volunActRecruEnd;
	private int volunActRecruMaxCount;
	private int volunActPoint;
	private int volunActAgeGroup;
	private int volunActNo;
	private int userNo;
	/**
	 * @return the volunActTitle
	 */
	private String getVolunActTitle() {
		return volunActTitle;
	}
	/**
	 * @param volunActTitle the volunActTitle to set
	 */
	private void setVolunActTitle(String volunActTitle) {
		this.volunActTitle = volunActTitle;
	}
	/**
	 * @return the volunActBeginTime
	 */
	private int getVolunActBeginTime() {
		return volunActBeginTime;
	}
	/**
	 * @param volunActBeginTime the volunActBeginTime to set
	 */
	private void setVolunActBeginTime(int volunActBeginTime) {
		this.volunActBeginTime = volunActBeginTime;
	}
	/**
	 * @return the volunActEndTime
	 */
	private int getVolunActEndTime() {
		return volunActEndTime;
	}
	/**
	 * @param volunActEndTime the volunActEndTime to set
	 */
	private void setVolunActEndTime(int volunActEndTime) {
		this.volunActEndTime = volunActEndTime;
	}
	/**
	 * @return the volunActAddress
	 */
	private String getVolunActAddress() {
		return volunActAddress;
	}
	/**
	 * @param volunActAddress the volunActAddress to set
	 */
	private void setVolunActAddress(String volunActAddress) {
		this.volunActAddress = volunActAddress;
	}
	/**
	 * @return the volunActProcBegin
	 */
	private LocalDate getVolunActProcBegin() {
		return volunActProcBegin;
	}
	/**
	 * @param volunActProcBegin the volunActProcBegin to set
	 */
	private void setVolunActProcBegin(LocalDate volunActProcBegin) {
		this.volunActProcBegin = volunActProcBegin;
	}
	/**
	 * @return the volunActProcEnd
	 */
	private LocalDate getVolunActProcEnd() {
		return volunActProcEnd;
	}
	/**
	 * @param volunActProcEnd the volunActProcEnd to set
	 */
	private void setVolunActProcEnd(LocalDate volunActProcEnd) {
		this.volunActProcEnd = volunActProcEnd;
	}
	/**
	 * @return the volunActRecruBegin
	 */
	private LocalDate getVolunActRecruBegin() {
		return volunActRecruBegin;
	}
	/**
	 * @param volunActRecruBegin the volunActRecruBegin to set
	 */
	private void setVolunActRecruBegin(LocalDate volunActRecruBegin) {
		this.volunActRecruBegin = volunActRecruBegin;
	}
	/**
	 * @return the volunActRecruEnd
	 */
	private LocalDate getVolunActRecruEnd() {
		return volunActRecruEnd;
	}
	/**
	 * @param volunActRecruEnd the volunActRecruEnd to set
	 */
	private void setVolunActRecruEnd(LocalDate volunActRecruEnd) {
		this.volunActRecruEnd = volunActRecruEnd;
	}
	/**
	 * @return the volunActRecruMaxCount
	 */
	private int getVolunActRecruMaxCount() {
		return volunActRecruMaxCount;
	}
	/**
	 * @param volunActRecruMaxCount the volunActRecruMaxCount to set
	 */
	private void setVolunActRecruMaxCount(int volunActRecruMaxCount) {
		this.volunActRecruMaxCount = volunActRecruMaxCount;
	}
	/**
	 * @return the volunActPoint
	 */
	private int getVolunActPoint() {
		return volunActPoint;
	}
	/**
	 * @param volunActPoint the volunActPoint to set
	 */
	private void setVolunActPoint(int volunActPoint) {
		this.volunActPoint = volunActPoint;
	}
	/**
	 * @return the volunActAgeGroup
	 */
	private int getVolunActAgeGroup() {
		return volunActAgeGroup;
	}
	/**
	 * @param volunActAgeGroup the volunActAgeGroup to set
	 */
	private void setVolunActAgeGroup(int volunActAgeGroup) {
		this.volunActAgeGroup = volunActAgeGroup;
	}
	/**
	 * @return the volunActNo
	 */
	private int getVolunActNo() {
		return volunActNo;
	}
	/**
	 * @param volunActNo the volunActNo to set
	 */
	private void setVolunActNo(int volunActNo) {
		this.volunActNo = volunActNo;
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
		return "AdminVolunDetailDTO [volunActTitle=" + volunActTitle + ", volunActBeginTime=" + volunActBeginTime
				+ ", volunActEndTime=" + volunActEndTime + ", volunActAddress=" + volunActAddress
				+ ", volunActProcBegin=" + volunActProcBegin + ", volunActProcEnd=" + volunActProcEnd
				+ ", volunActRecruBegin=" + volunActRecruBegin + ", volunActRecruEnd=" + volunActRecruEnd
				+ ", volunActRecruMaxCount=" + volunActRecruMaxCount + ", volunActPoint=" + volunActPoint
				+ ", volunActAgeGroup=" + volunActAgeGroup + ", volunActNo=" + volunActNo + ", userNo=" + userNo + "]";
	}
	  
	
	
}
