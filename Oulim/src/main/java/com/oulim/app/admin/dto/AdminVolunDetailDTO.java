package com.oulim.app.admin.dto;

import java.sql.Date;
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
	private Date volunActProcBegin;
	private Date volunActProcEnd;
	private Date volunActRecruBegin;
	private Date volunActRecruEnd;
	private int volunActRecruMaxCount;
	private int volunActPoint;
	private int volunActAgeGroup;
	private int volunActNo;
	private int userNo;
	public String getVolunActTitle() {
		return volunActTitle;
	}
	public void setVolunActTitle(String volunActTitle) {
		this.volunActTitle = volunActTitle;
	}
	public int getVolunActBeginTime() {
		return volunActBeginTime;
	}
	public void setVolunActBeginTime(int volunActBeginTime) {
		this.volunActBeginTime = volunActBeginTime;
	}
	public int getVolunActEndTime() {
		return volunActEndTime;
	}
	public void setVolunActEndTime(int volunActEndTime) {
		this.volunActEndTime = volunActEndTime;
	}
	public String getVolunActAddress() {
		return volunActAddress;
	}
	public void setVolunActAddress(String volunActAddress) {
		this.volunActAddress = volunActAddress;
	}
	public Date getVolunActProcBegin() {
		return volunActProcBegin;
	}
	public void setVolunActProcBegin(Date volunActProcBegin) {
		this.volunActProcBegin = volunActProcBegin;
	}
	public Date getVolunActProcEnd() {
		return volunActProcEnd;
	}
	public void setVolunActProcEnd(Date volunActProcEnd) {
		this.volunActProcEnd = volunActProcEnd;
	}
	public Date getVolunActRecruBegin() {
		return volunActRecruBegin;
	}
	public void setVolunActRecruBegin(Date volunActRecruBegin) {
		this.volunActRecruBegin = volunActRecruBegin;
	}
	public Date getVolunActRecruEnd() {
		return volunActRecruEnd;
	}
	public void setVolunActRecruEnd(Date volunActRecruEnd) {
		this.volunActRecruEnd = volunActRecruEnd;
	}
	public int getVolunActRecruMaxCount() {
		return volunActRecruMaxCount;
	}
	public void setVolunActRecruMaxCount(int volunActRecruMaxCount) {
		this.volunActRecruMaxCount = volunActRecruMaxCount;
	}
	public int getVolunActPoint() {
		return volunActPoint;
	}
	public void setVolunActPoint(int volunActPoint) {
		this.volunActPoint = volunActPoint;
	}
	public int getVolunActAgeGroup() {
		return volunActAgeGroup;
	}
	public void setVolunActAgeGroup(int volunActAgeGroup) {
		this.volunActAgeGroup = volunActAgeGroup;
	}
	public int getVolunActNo() {
		return volunActNo;
	}
	public void setVolunActNo(int volunActNo) {
		this.volunActNo = volunActNo;
	}
	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
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
