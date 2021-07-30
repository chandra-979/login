package com.user.login.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.login.dto.UserDTO;
import com.user.login.service.UserLoginService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserLoginService service;
	
	@PostMapping("/save")
	public Integer saveUser(@RequestBody UserDTO user) throws Exception
	{
		
		return service.saveUser(user);
	}
	
	@GetMapping("/get-users")
	public List<UserDTO> getAllUsers() throws Exception
	{
		return service.getAllUsers();
	}

}
