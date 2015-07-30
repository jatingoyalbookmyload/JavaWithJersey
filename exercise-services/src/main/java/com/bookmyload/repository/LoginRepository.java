package com.bookmyload.repository;

import java.util.List;

import com.bookmyload.model.Login;

public interface LoginRepository {

	List<Login> findAllLogin();

	Login findLogin(String loginEmailAddress);

	void create(Login login1);

}