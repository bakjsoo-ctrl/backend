package com.oulim.app.common.util;

// 공통 페이지네이션 규칙을 적용할 클래스
public class BasePagenation {
	private int page = 1;
	
	// mySQL 전달용
	private int limit = 0;
	private int offset = 0;
	
	// 페이지 당 행 갯수 선언
	public static final int ROWCOUNT_PER_PAGE = 10;
	public static final int MAX_PAGE_COUNT=10;
	
	// 화면 출력용 변수
	private int realEndPage;
	private int startPage;
	private int endPage;
	private boolean prev;
	private boolean next;
	
	// 페이지 숫자 조절용
	private int changedMaxPageCount = 0;
	
	public BasePagenation(int currPage, int total ) {
		this.page=currPage;
		this.limit = ROWCOUNT_PER_PAGE;
		this.offset = (this.page - 1) * ROWCOUNT_PER_PAGE;
		int maxPageCnt = changedMaxPageCount > 0 ? changedMaxPageCount : MAX_PAGE_COUNT;
		
		this.realEndPage = (int)(Math.ceil(total / (double)ROWCOUNT_PER_PAGE));
		
	    if(this.realEndPage == 0) {
	    	this.realEndPage = 1;
	    }		
		
		this.endPage = (int)(Math.ceil(page / (double) maxPageCnt) * maxPageCnt);
		this.startPage = this.endPage - (maxPageCnt - 1);
		if(this.startPage < 1) {
			this.startPage = 1;
		}
		this.endPage = Math.min(this.endPage, this.realEndPage);
		this.startPage = this.endPage - (maxPageCnt - 1);
		
		this.prev = this.startPage > 1;
		this.next = this.endPage < this.realEndPage;
	}
	
	public void setLowerMaxPageCount(int pageCnt) {
		this.changedMaxPageCount  = pageCnt;
	}
	
	public int getLowerMaxPageCount() {
		return this.changedMaxPageCount ;
	}
	
	public int getLimit() {
		return this.limit;
	}
	
	public int getOffset() {
		return this.offset;
	}
	
	public boolean getIsPrev() {
		return this.prev;
	}
	
	public boolean getIsNext(){
		return this.next;
	}
	
	public int getStartPage() {
		return this.startPage;
	}
	
	public int getEndPage() {
		return this.endPage;
	}
	
	public int getRealEndPage() {
		return this.realEndPage;
	}
	
}
