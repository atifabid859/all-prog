package springmvcsearch;

import java.util.Date;



public class UserForm {
	
	private String fName;
	private String lName;
	private String address;
	private String email;
	private String password;
	private String mobile;
	private Date date;
	private String gender;
	
	private Address address1;
	
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Address getAddress1() {
		return address1;
	}
	public void setAddress1(Address address1) {
		this.address1 = address1;
	}
	@Override
	public String toString() {
		return "UserForm [fName=" + fName + ", lName=" + lName + ", address=" + address + ", email=" + email
				+ ", password=" + password + ", mobile=" + mobile + ", date=" + date + ", gender=" + gender
				+ ", address1=" + address1 + "]";
	}
	
	
	
}