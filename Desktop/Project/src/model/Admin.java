package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Data.ProjectMain;

public class Admin {
private long Idadmn_login;
private String Admn_user;
private String Admn_pass;
	
	// properties for get and set
	public long getAdminId() {
		return Idadmn_login;
	}
	public void setAdminId(long idadmn_login) {
		Idadmn_login = idadmn_login;
	}
	public String getAdminuser() {
		return Admn_user;
	}
	public void setAdminuser(String admn_user) {
		Admn_user = admn_user;
	}
	public String getAdminpass() {
		return Admn_pass;
	}
	public void setAdminpass(String admn_pass) {
		Admn_pass = admn_pass;
	}
	public ResultSet Login (String username, String Pass) throws Exception {
		String query ="SELECT * FROM dbo.admn_login WHERE admn_user = "
				+ "'"+username+"' AND admn_pass = '"+Pass+"'";				
		ProjectMain da = new ProjectMain();
		return da.ExecuteQuery(query);
	}
}
