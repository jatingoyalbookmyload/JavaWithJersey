package com.bookmyload.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Login {
	private long Id ;
	private String email;
	private String mobileNumber;
	private String password;
    private LoginInfo loginInfo;
	
    @XmlElement(name="Id")
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public LoginInfo getLoginInfo() {
		return loginInfo;
	}
	public void setLoginInfo(LoginInfo loginInfo) {
		this.loginInfo = loginInfo;
	}
	@XmlElement(name="Email")
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@XmlElement(name="MobileNumber")
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	@XmlElement(name="Password")
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
