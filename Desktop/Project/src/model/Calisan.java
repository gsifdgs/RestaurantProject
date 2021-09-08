package model;

import java.sql.ResultSet;
import java.util.ArrayList;
import Data.ProjectMain;;

public class Calisan extends person {
	//data members11
	private long Idcalsanlar_login;
	private String Calsanlar_role;
	private String Calsanlar_tarih;
	private String Calsanlar_maas;
	private String Calsanlar_gorev;
	private String IdCalsanlar_login;
	// properties for get and set
	public long getEmployeeId() {
		return Idcalsanlar_login;
	}
	public void setEmployeeId(long idcalsanlar_login) {
		Idcalsanlar_login = idcalsanlar_login;
	}
	
	public String getEmployeeGorev() {
		return Calsanlar_gorev;
	}
	public void setEmployeeGorev(String calsanlar_gorev) {
		Calsanlar_gorev = calsanlar_gorev;
	}
	public String getRoleId() {
		return Calsanlar_role;
	}
	public void setRoleId(String calsanlar_role) {
		Calsanlar_role = calsanlar_role;
	}
	public String getHireDate() {
		return Calsanlar_tarih;
	}
	public void setHireDate(String calsanlar_tarih) {
		Calsanlar_tarih = calsanlar_tarih;
	}
	public String getSalary() {
		return Calsanlar_maas;
	}
	public void setSalary(String maas) {
		Calsanlar_maas = maas;
	}
	// Methods
	public int  addEmployee(Calisan e) throws Exception {
		String query =String.format("insert into calsanlar_login(calsanlar_name" + 
				",calsanlar_adress,calsanlar_loginuser,calsanlar_loginpass,calsanlar_gender,calsanlar_birth,calsanlar_num" + 
				",calsanlar_tarih,calsanlar_maas,calsanlar_role)"
				+ "values('%s','%s','%s','%s','%s','%s','%s','%s','%s','%s')",
				e.getName()
				,e.getAddress()
				,e.getEmail()
				,e.getPassword()
				,e.getGender()
				,e.getDateofBirth()
				,e.getMobileNo()
				,e.getHireDate()
				,e.getSalary()
				,e.getRoleId());
	
		ProjectMain da = new ProjectMain();
		return da.ExecuteUpdate(query);
	}
	public int  deleteEmployee(long Id) throws Exception {
		String query =String.format("delete from calsanlar_login where idcalsanlar_login = %s",Id);
		ProjectMain da = new ProjectMain();
		return da.ExecuteUpdate(query);
	}
	public String Return(String username) {
		return username;
	}
	//public ResultSet  login_information() throws Exception {
		//Return();
		//String query ="select * from calsanlar WHERE calsanlar_name = '"+username+"'"; 
		//ProjectMain da = new ProjectMain();
		//return da.ExecuteQuery(query);
		//}
	public int updateAdmin(Calisan a) throws Exception
	{
		String query =String.format("update calsanlar_login set calsanlar_name='%s', calsanlar_adress='%s', calsanlar_num = '%s', calsanlar_role = '%s', calsanlar_maas = '%s' where idcalsanlar_login = '%d'",
				a.getName(),a.getAddress(),a.getMobileNo(),a.getRoleId(),a.getSalary(),a.getId()) ;
		ProjectMain da = new ProjectMain();
		return da.ExecuteUpdate(query);
	}
	public int  updateEmployees(Calisan e) throws Exception {
		String query =String.format("update calsanlar_login set calsanlar_name=%s " + 
				",calsanlar_adress = %s,calsanlar_username=%s,calsanlar_password=%s,calsanlar_gender=%s,calsanlar_birth=%s,calsanlar_num=%s" + 
				",calsanlar_tarih=%s,calsanlar_maas=%s,calsanlar_role=%s"+
				" where idcalsanlar_login =%s",
				e.getName()
				+e.getAddress()
				+e.getEmail()
				+e.getPassword()
				+e.getGender()
				+e.getDateofBirth()
				+e.getMobileNo()
				+e.getHireDate()
				+e.getSalary()
				+e.getRoleId());
				
		ProjectMain da = new ProjectMain();
		return da.ExecuteUpdate(query);
	}
	public int  updateEmployeeMission(Calisan a) throws Exception {
		String query =String.format("update calsanlar_login set calsanlar_gorev = '%s' where idcalsanlar_login = '%d'",
				a.getGrev(),a.getId()) ;
		ProjectMain da = new ProjectMain();
		return da.ExecuteUpdate(query);
	}
	public int  updateThisEmployeeMission(Calisan e) throws Exception {
		String query =String.format("update calsanlar_login set calsanlar_gorev='%s'"+
				" where calsanlar_num ='%s'",e.getEmployeeGorev(),e.getMobileNo());
				
		ProjectMain da = new ProjectMain();
		return da.ExecuteUpdate(query);
	}
	public ResultSet listEmployee() throws Exception {
		String query ="select * from calsanlar_login"; 
		ProjectMain da = new ProjectMain();
		return da.ExecuteQuery(query);
	}	
	public ResultSet  searchByName(String name) throws Exception {
		String query ="select * from calsanlar_login WHERE calsanlar_name = '"+name+"'"; 
		ProjectMain da = new ProjectMain();
		return da.ExecuteQuery(query);
	}
	public ResultSet  searchByID(long Id) throws Exception {
		String query ="select * from calsanlar_login where idcalsanlar_login = '"+Id+"'"; 
		ProjectMain da = new ProjectMain();
		return da.ExecuteQuery(query);
	}
	public ResultSet  searchByDepartment(String Dep) throws Exception {
		String query ="select * from calsanlar_login where calsanlar_role = '"+Dep+"'"; 
		ProjectMain da = new ProjectMain();
		return da.ExecuteQuery(query);
	}
	public ResultSet  searchByPhone(String Num) throws Exception {
		String query ="select * from calsanlar_login where calsanlar_num =  '"+Num+"'"; 
		ProjectMain da = new ProjectMain();
		return da.ExecuteQuery(query);
	}

	public ResultSet Login (String username, String Pass) throws Exception {
		String query ="SELECT * FROM dbo.calsanlar_login WHERE calsanlar_loginuser = "
				+ "'"+username+"' AND calsanlar_loginpass = '"+Pass+"'";				
		ProjectMain da = new ProjectMain();
		return da.ExecuteQuery(query);
	
	}
}
