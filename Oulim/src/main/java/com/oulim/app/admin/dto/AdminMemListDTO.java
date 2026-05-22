package com.oulim.app.admin.dto;

public class AdminMemListDTO {

    private int userNo;
    private String userId;
    private String userNickname;
    private String userName;
    private int userType;
    private String userTypeText;
    private String searchType;
    private String keyword;
    private int pageSize;  // 추가
    private int offset;    // 추가

    public int getUserNo() { return userNo; }
    public void setUserNo(int userNo) { this.userNo = userNo; }
    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }
    public String getUserNickname() { return userNickname; }
    public void setUserNickname(String userNickname) { this.userNickname = userNickname; }
    public String getUserName() { return userName; }
    public void setUserName(String userName) { this.userName = userName; }
    public int getUserType() { return userType; }
    public void setUserType(int userType) { this.userType = userType; }
    public String getUserTypeText() { return userTypeText; }
    public void setUserTypeText(String userTypeText) { this.userTypeText = userTypeText; }
    public String getSearchType() { return searchType; }
    public void setSearchType(String searchType) { this.searchType = searchType; }
    public String getKeyword() { return keyword; }
    public void setKeyword(String keyword) { this.keyword = keyword; }
    public int getPageSize() { return pageSize; }
    public void setPageSize(int pageSize) { this.pageSize = pageSize; }
    public int getOffset() { return offset; }
    public void setOffset(int offset) { this.offset = offset; }

    @Override
    public String toString() {
        return "AdminMemListDTO [userNo=" + userNo + ", userId=" + userId + ", userNickname=" + userNickname
                + ", userName=" + userName + ", userType=" + userType + ", userTypeText=" + userTypeText
                + ", searchType=" + searchType + ", keyword=" + keyword + ", pageSize=" + pageSize + ", offset=" + offset + "]";
    }
}