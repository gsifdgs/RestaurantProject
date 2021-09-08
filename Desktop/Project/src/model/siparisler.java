package model;

import Data.ProjectMain;

public class siparisler {
	private String Name;
	private String Money;
	private String Kind;
	private String Code;
	//data hiding or Encapsulation
	// get and setter properties
	public void setNname(String name){
		Name =name;
	}
	public String getNname(){
		return Name ;
	}

	public String getmoney() {
		return Money;
	}
	public void setmoney(String money) {
		Money  = money;
	}	
	public String getkind() {
		return Kind;
	}
	public void setkind(String kind) {
		Kind  = kind;
	}	
	public String getcode() {
		return Code;
	}
	public void setcode(String code) {
		Code  = code;
	}	
}
