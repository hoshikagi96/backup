package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.ecsite.dto.AdminLoginDTO;
import com.internousdev.ecsite.util.DBConnector;

public class AdminLoginDAO {
	private DBConnector dbConnector=new DBConnector();
	private Connection connection=dbConnector.getConnection();
	private AdminLoginDTO adminLoginDTO=new AdminLoginDTO();
	public AdminLoginDTO getLoginAdminInfo(String loginAdminId,String loginAdminPassword){
		String sql="SELECT * FROM login_admin_transaction where admin_id=? AND admin_pass=?";
		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, loginAdminId);
			preparedStatement.setString(2, loginAdminPassword);

			ResultSet resultSet=preparedStatement.executeQuery();

			if(resultSet.next()){
				adminLoginDTO.setLoginAdminId(resultSet.getString("admin_id"));
				adminLoginDTO.setLoginAdminPassword(resultSet.getString("admin_pass"));
				adminLoginDTO.setAdminName(resultSet.getString("admin_name"));

				if(!(resultSet.getString("admin_id").equals(null))){
					adminLoginDTO.setLoginFlg(true);
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return adminLoginDTO;
	}
	public AdminLoginDTO getAdminLoginDTO(){
		return adminLoginDTO;
	}

}