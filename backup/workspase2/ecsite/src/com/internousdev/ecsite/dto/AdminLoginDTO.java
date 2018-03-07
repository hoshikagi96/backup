package com.internousdev.ecsite.dto;

public class AdminLoginDTO {
	private String loginAdminId;
	private String loginAdminPassword;
	private String adminName;
	private boolean loginFlg=false;

	public String getLoginAdminId(){
		return loginAdminId;
	}
	public void setLoginAdminId(String loginAdminId){
		this.loginAdminId=loginAdminId;
	}
	public String getLoginAdminPassword(){
		return loginAdminPassword;
	}
	public void setLoginAdminPassword(String loginAdminPassword){
		this.loginAdminPassword=loginAdminPassword;
	}
	public String getAdminName(){
		return adminName;
	}
	public void setAdminName(String adminName){
		this.adminName=adminName;
	}
	public boolean getLoginFlg(){
		return loginFlg;
	}
	public void setLoginFlg(boolean loginFlg){
		this.loginFlg=loginFlg;
	}

}
