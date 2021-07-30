package com.user.login.service;

import java.util.List;

import com.user.login.dto.UserDTO;

public interface UserLoginService {
	
	public Integer saveUser(UserDTO user) throws Exception;
	
	public List<UserDTO> getAllUsers() throws Exception;
	

}
