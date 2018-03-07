package com.internousdev.ecsite.action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.AdminLoginDAO;

import com.internousdev.ecsite.dto.AdminLoginDTO;

import com.opensymphony.xwork2.ActionSupport;

public class AdminLoginAction extends ActionSupport implements SessionAware{
	private String loginAdminId;
	private String loginAdminPassword;
	public Map<String,Object> session;
	private AdminLoginDAO adminLoginDAO=new AdminLoginDAO();
	private AdminLoginDTO adminLoginDTO=new AdminLoginDTO();

	public String execute(){
		String result=ERROR;
		adminLoginDTO=adminLoginDAO.getLoginAdminInfo(loginAdminId,loginAdminPassword);
		session.put("loginAdmin", adminLoginDTO);
		if(((AdminLoginDTO)session.get("loginAdmin")).getLoginFlg()){
			result=SUCCESS;



			return result;
		}
		return result;
	}
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
	@Override
	public void setSession(Map<String,Object>session){
		this.session=session;
	}
}