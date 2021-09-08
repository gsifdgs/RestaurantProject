package model;
import java.sql.ResultSet;
import java.util.ArrayList;
import Data.ProjectMain;;

public class yemekler extends siparisler {
	//data members
	private long Sparisler_name;
	private String Sparisler_tur;
	private String Sparisler_kod;
	private String Sparisler_para;
	
	// properties for get and set
	public long getFoodId() {
		return Sparisler_name;
	}
	public void setFoodId(long siparisid) {
		Sparisler_name = siparisid;
	}
	public String getRoleId() {
		return Sparisler_tur;
	}
	public void setRoleId(String sparisler_tur) {
		Sparisler_tur = sparisler_tur;
	}
	public String getCode() {
		return Sparisler_kod;
	}
	public void setCode(String sparisler_kod) {
		Sparisler_kod = sparisler_kod;
	}
	public String getMoney() {
		return Sparisler_para;
	}
	public void setMoney(String sparisler_para) {
		Sparisler_para = sparisler_para;
	}
	// Methods

	public int  addSiparis(yemekler b) throws Exception {
		String query =String.format("insert into sparisler(sparisler_name" + 
	",sparisler_kod,sparisler_tur,sparisler_para)  " 
				+ "values('%s','%s','%s','%s')",
				b.getNname()
				,b.getcode()
				,b.getkind()
				,b.getmoney());
	System.out.println(query);
		ProjectMain da = new ProjectMain();
		return da.ExecuteUpdate(query);
	}
	public int  deleteFood(long Id) throws Exception {
		String query =String.format("delete from sparisler where idsparisler = %s",Id);
		ProjectMain da = new ProjectMain();
		return da.ExecuteUpdate(query);
	}
	public int updateAdmin(yemekler a) throws Exception
	{
		String query =String.format("update sparisler set sparisler_name='%s', sparisler_para='%s', sparisler_tur = '%s', sparisler_kod = '%s' where idsparisler = '%d'",
				a.getNname(),a.getmoney(),a.getkind(),a.getcode(),a.getFoodId());
		ProjectMain da = new ProjectMain();
		return da.ExecuteUpdate(query);
	}
	public int  updateFood(yemekler b) throws Exception {
		String query =String.format("update sparisler set sparisler_name=%s " + 
				",sparisler_para = %s,sparisler_tur=%s,sparisler_kod=%s"+
				" where idmsteri =%s",
				b.getNname()
				+b.getmoney()
				+b.getkind()
				+b.getcode());
				
		ProjectMain da = new ProjectMain();
		return da.ExecuteUpdate(query);
	}
	
	public ResultSet listYemekler() throws Exception {
		String query ="select * from sparisler"; 
		ProjectMain da = new ProjectMain();
		return da.ExecuteQuery(query);
	}	
	public ResultSet  searchByName(String name) throws Exception {
		String query ="select * from sparisler WHERE sparisler_name = '"+name+"'"; 
		ProjectMain da = new ProjectMain();
		return da.ExecuteQuery(query);
	}
	public ResultSet  searchByID(long Id) throws Exception {
		String query ="select * from sparisler where idsparisler = '"+Id+"'"; 
		ProjectMain da = new ProjectMain();
		return da.ExecuteQuery(query);
	}
	
	public ResultSet  showByID(long Id) throws Exception {
		String query ="select * from sparisler where idsparisler = '"+Id+"'"; 
		ProjectMain da = new ProjectMain();
		return da.ExecuteQuery(query);
	}
	public ResultSet  searchBypara(String money) throws Exception {
		String query ="select * from sparisler where sparisler_para = '"+money+"'"; 
		ProjectMain da = new ProjectMain();
		return da.ExecuteQuery(query);
	}
	public ResultSet  searchBykind(String Tur) throws Exception {
		String query ="select * from sparisler where sparisler_tur = '"+Tur+"'"; 
		ProjectMain da = new ProjectMain();
		return da.ExecuteQuery(query);
	}
	public ResultSet  searchBykod(String Kodd) throws Exception {
		String query ="select * from sparisler where sparisler_kod = '"+Kodd+"'"; 
		ProjectMain da = new ProjectMain();
		return da.ExecuteQuery(query);
	}

	
}