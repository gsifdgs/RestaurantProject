package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Data.ProjectMain;

public class Musteri extends person {
	private long Idmsteri_login;
	
	// properties for get and set
	public long getMusteriId() {
		return Idmsteri_login;
	}
	public void setMusteriId(long idmsteri_login) {
		Idmsteri_login = idmsteri_login;
	}
	
	
	public int  addMusteri(Musteri e) throws Exception {
		String query =String.format("insert into msteri_login(msteri_ad" + 
	",msteri_adress,msteri_user,msteri_pass,msteri_gender,msteri_birth,msteri_number,msteri_aktiflik)  " 
				+ "values('%s','%s','%s','%s','%s','%s','%s','%s')",
				e.getName()
				,e.getAddress()
				,e.getEmail()
				,e.getPassword()
				,e.getGender()
				,e.getDateofBirth()
				,e.getMobileNo()
				,e.getEtkinlik());
	System.out.println(query);
		ProjectMain da = new ProjectMain();
		return da.ExecuteUpdate(query);
	}
	public int  deleteMusteri(long Id) throws Exception {
		String query =String.format("delete from msteri_login where idmsteri_login = %s",Id);
		ProjectMain da = new ProjectMain();
		return da.ExecuteUpdate(query);
	}
	public int updateAdmin(Musteri a) throws Exception
	{
		String query =String.format("update msteri_login set msteri_ad='%s', msteri_adress='%s', msteri_number = '%s' where idmsteri_login = '%d'",
				a.getName(),a.getAddress(),a.getMobileNo(),a.getId()) ;
		ProjectMain da = new ProjectMain();
		return da.ExecuteUpdate(query);
	}
	public int updateFoodAdmin(Musteri a) throws Exception
	{
		String query =String.format("update msteri_login set msteri_siparis='%s',msteri_aktiflik = '%s' where idmsteri_login = '%d'",
				a.getSiparis(),a.getEtkinlik(),a.getId()) ;
		ProjectMain da = new ProjectMain();
		return da.ExecuteUpdate(query);
	}
	public int  updateMusteri(Musteri e) throws Exception {
		String query =String.format("update calisanlar_login set calisanlar_name=%s " + 
				",Address = %s,Email=%s,Password=%s,Gender=%s,DateOfBirth=%s,MobileNo=%s",
				e.getName()
				+e.getAddress()
				+e.getEmail()
				+e.getPassword()
				+e.getGender()
				+e.getDateofBirth()
				+e.getMobileNo());
				
		ProjectMain da = new ProjectMain();
		return da.ExecuteUpdate(query);
	}
	
	public ResultSet listMusteri() throws Exception {
		String query ="select * from msteri_login"; 
		ProjectMain da = new ProjectMain();
	
		return da.ExecuteQuery(query);
	}
	public ResultSet  searchBymNamee(String name) throws Exception {
		String query ="select * from msteri_login WHERE msteri_ad = '"+name+"'"; 
		ProjectMain da = new ProjectMain();
		return da.ExecuteQuery(query);
	}
	public ResultSet  searchmID(long search) throws Exception {
		String query ="select * from msteri_login WHERE idmsteri_login = '"+search+"'"; 
		ProjectMain da = new ProjectMain();
		return da.ExecuteQuery(query);
	}
	public ResultSet  searchmAdress(String adress) throws Exception {
		String query ="select * from msteri_login WHERE msteri_adress = '"+adress+"'"; 
		ProjectMain da = new ProjectMain();
		return da.ExecuteQuery(query);
	}
	public ResultSet  searchmPhone(String NUM) throws Exception {
		String query ="select * from msteri_login WHERE msteri_number = '"+NUM+"'"; 
		ProjectMain da = new ProjectMain();
		return da.ExecuteQuery(query);
	}
	public ResultSet  searchmaktif(String aktif) throws Exception {
		String query ="select * from msteri_login WHERE msteri_aktiflik = '"+aktif+"'"; 
		ProjectMain da = new ProjectMain();
		return da.ExecuteQuery(query);
	}


	public ResultSet Login (String username, String Pass) throws Exception {
		String query ="SELECT * FROM dbo.msteri_login WHERE msteri_user = "
				+ "'"+username+"' AND msteri_pass = '"+Pass+"'";				
		ProjectMain da = new ProjectMain();
		return da.ExecuteQuery(query);
	
	}
	public int adddMusteri(String name, String adres, String username, String password, String gender, String birth,
			String numara) throws Exception 
	{	
		/*
		String query =String.format("INSERT INTO restoran.msteri_login(msteri_user, msteri_pass, msteri_ad)values(%s,",
				);
				+ "'"+name+"' AND msteri_adress = '"+adres+"' AND msteri_user = '"+username+"'msteri_pass =+ '"+password+"'"
						+ " AND msteri_gender = '"+gender+"' AND msteri_birth = '"+birth+"'msteri_number = '"+numara+"'";				
		System.out.println(query);
		ProjectMain kl = new ProjectMain();
		return kl.ExecuteUpdate(query);
		*/
		
		return 0;
	}
}
