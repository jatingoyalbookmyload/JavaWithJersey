package com.bookmyload;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

import com.bookmyload.model.Login;
import com.bookmyload.model.LoginInfo;
import com.bookmyload.repository.LoginRepository;
import com.bookmyload.repository.LoginRepositoryStub;

@Path("logins")
public class LoginResource {

	private LoginRepository loginRepository = new LoginRepositoryStub();
	@POST
	@Path("login")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Login createLogin(Login login) {
		LoginInfo li = new LoginInfo();
				li.setAccess_Token("1312");
		li.setCustomerID(1213);
		li.setExpires_In(1356);
		li.setFirstName("jatin");
		li.setLastName("goyal");
		Login login1 = new Login();
		login1.setId(login.getId());
		login1.setMobileNumber(login.getMobileNumber());
		login1.setPassword(login.getPassword());
		login1.setEmail(login.getEmail());
		login1.setLoginInfo(li);
		loginRepository.create(login1);
		return login1;
	}

	@POST
	@Path("login")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Login createLoginParams(MultivaluedMap<String, String> formParams) {
		LoginInfo li = new LoginInfo();
		li.setAccess_Token("1312");
		li.setCustomerID(1213);
		li.setExpires_In(1356);
		li.setFirstName("jatin");
		li.setLastName("goyal");
		Login login1 = new Login();
		login1.setId(Integer.parseInt(formParams.getFirst("Id")));
		login1.setMobileNumber(formParams.getFirst("mobileNumber"));
		login1.setPassword(formParams.getFirst("password"));
		login1.setEmail(formParams.getFirst("email"));
		login1.setLoginInfo(li);
		loginRepository.create(login1);
		return login1;
	}

	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<Login> getAllLogins() {

		return loginRepository.findAllLogin();

	}

	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Path("{loginEmailAddress}")
	public Login getLogin(@PathParam("loginEmailAddress") String loginEmailAddress) {

		return loginRepository.findLogin(loginEmailAddress);

	}

	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Path("{loginEmailAddress}/LoginInfo")
	public LoginInfo getLoginInfo(@PathParam("loginEmailAddress") String loginEmailAddress) {
		LoginInfo li = new LoginInfo();
		li.setAccess_Token("1312");
		li.setCustomerID(1213);
		li.setExpires_In(1356);
		li.setFirstName("jatin");
		li.setLastName("goyal");

		return li;

	}

}
