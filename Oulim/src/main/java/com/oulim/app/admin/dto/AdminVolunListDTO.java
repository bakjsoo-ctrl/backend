package com.oulim.app.admin.dto;

import java.sql.Date;

public class AdminVolunListDTO {

//	봉사번호
//	신청자아이디
//	단체명
//	시작일
//	종료일
//	지급포인트
//	진행상태
//	====
//	상세보기
//	선택창입력창조회버튼
//	페이지네이션
    private int volunActNo;              // 봉사번호
    private String userId;               // 기업회원 아이디
    private String organName;            // 단체명
    private Date volunActProcBegin;      // 시작일
    private Date volunActProcEnd;        // 종료일
    private int volunActPoint;           // 지급 포인트
    private String procStatus;  	//진행상태 
    
    
	public int getVolunActNo() {
		return volunActNo;
	}
	public void setVolunActNo(int volunActNo) {
		this.volunActNo = volunActNo;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getOrganName() {
		return organName;
	}
	public void setOrganName(String organName) {
		this.organName = organName;
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
	public int getVolunActPoint() {
		return volunActPoint;
	}
	public void setVolunActPoint(int volunActPoint) {
		this.volunActPoint = volunActPoint;
	}
	public String getProcStatus() {
		return procStatus;
	}
	public void setProcStatus(String procStatus) {
		this.procStatus = procStatus;
	}
	@Override
	public String toString() {
		return "AdminVolunListDTO [volunActNo=" + volunActNo + ", userId=" + userId + ", organName=" + organName
				+ ", volunActProcBegin=" + volunActProcBegin + ", volunActProcEnd=" + volunActProcEnd
				+ ", volunActPoint=" + volunActPoint + ", procStatus=" + procStatus + "]";
	}
    
    
    
}
