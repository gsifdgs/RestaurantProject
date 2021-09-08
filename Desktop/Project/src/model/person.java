package model;

public class person {
	private String Name;
	private String Email;
	private String Password;
	private String Address;
	private String Gender;
	private String DateofBirth;
	private String MobileNo;
	private String Siparis;
	private String Etkinlik;
	private String Gorev;
	private long Id;
	//data hiding or Encapsulation
	// get and setter properties
	public void setName(String name){
		Name =name;
	}
	public String getName(){
		return Name ;
	}
	public void setId(long id){
		Id =id;
	}
	public long getId(){
		return Id ;
	}
	public void setGrev(String gorev){
		Gorev =gorev;
	}
	public String getGrev(){
		return Gorev ;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getDateofBirth() {
		return DateofBirth;
	}
	public void setDateofBirth(String dateofBirth) {
		DateofBirth = dateofBirth;
	}
	public String getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(String mobileNo) {
		MobileNo = mobileNo;
	}
	public String getSiparis() {
		return Siparis;
	}
	public void setSiparis(String siparis) {
		Siparis  = siparis;
	}	
	public String getEtkinlik() {
		return Etkinlik;
	}
	public void setEtkinlik(String etkinlik) {
		Etkinlik = etkinlik;
	}
	
//	public void Login(String email, String password)
//	{
//		
//	}
//
//	public void Logout()
//	{
//		
//	}
}
