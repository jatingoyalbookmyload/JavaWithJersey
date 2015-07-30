package com.bookmyload.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class LoginInfo {

	public String Access_Token ;
    public long Expires_In ;
    public String Token_Type ;
    public String IssuedOn ;
    public long CustomerID ;
    public String FirstName ;
    public String LastName ;
    
    @XmlElement(name="Access_Token")
    public String getAccess_Token() {
		return Access_Token;
	}
	public void setAccess_Token(String access_Token) {
		Access_Token = access_Token;
	}
	   @XmlElement(name="Expires_In")
	public long getExpires_In() {
		return Expires_In;
	}
	public void setExpires_In(long expires_In) {
		Expires_In = expires_In;
	}
	   @XmlElement(name="Token_Type")
	public String getToken_Type() {
		return Token_Type;
	}
	public void setToken_Type(String token_Type) {
		Token_Type = token_Type;
	}
	 @XmlElement(name="IssuedOn")
	public String getIssuedOn() {
		return IssuedOn;
	}
	public void setIssuedOn(String issuedOn) {
		IssuedOn = issuedOn;
	}
	 @XmlElement(name="CustomerID")
	public long getCustomerID() {
		return CustomerID;
	}
	public void setCustomerID(long customerID) {
		CustomerID = customerID;
	}
	 @XmlElement(name="FirstName")
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	 @XmlElement(name="LastName")
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
   
	
}
