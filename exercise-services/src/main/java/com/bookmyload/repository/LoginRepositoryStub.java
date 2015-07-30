package com.bookmyload.repository;

import java.util.ArrayList;
import java.util.List;

import com.bookmyload.model.Login;

public class LoginRepositoryStub implements LoginRepository {
	

	List<Login> logins =new ArrayList<Login>();
	
	/* (non-Javadoc)
	 * @see com.bookmyload.repository.LoginRepository#findAllLogin()
	 */
	@Override
	public List<Login> findAllLogin()
	{

		
		Login login1=new Login();
		login1.setEmail("jatingoyal100@gmail.com");
		login1.setPassword("1234566789@354");
		Login login2=new Login();
		login2.setMobileNumber("9868774206");
		login2.setPassword("1234566789@354");		
		Login login3=new Login();
		login3.setMobileNumber("9868774206");
		login3.setEmail("jatingoyal100@gmail.com");
		login3.setPassword("1234566789@354");	
		logins.add(login1);
		logins.add(login2);
		logins.add(login3);
		return logins;

				
		
	}

	@Override
	public Login findLogin(String loginEmailAddress) {
		Login login1=new Login();
		login1.setEmail(loginEmailAddress);
		login1.setPassword("1234566789@354");
	return login1;
	
	}

	@Override
	public void create(Login login1) {
		logins.add(login1);
		
	}

}
