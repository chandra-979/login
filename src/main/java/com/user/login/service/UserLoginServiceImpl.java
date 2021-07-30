package com.user.login.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.login.dto.UserDTO;
import com.user.login.entity.User;
import com.user.login.repo.UserRepo;

@Service
public class UserLoginServiceImpl implements UserLoginService{
	
	@Autowired
	UserRepo repo;

	//INSERT INTO User VALUES('','','','','',);
	@Override
	public Integer saveUser(UserDTO user) throws Exception {
		// TODO Auto-generated method stub
		User userEntity=user.convertDtoTOEntity(user);
		User userSaved=repo.save(userEntity);
		return userSaved.getUserId();
	}

	//SELECT * FROM USER;
	@Override
	public List<UserDTO> getAllUsers() throws Exception {
		// TODO Auto-generated method stub
		Iterable<User> users=repo.findAll();
		List<UserDTO> userDTOs=new ArrayList<>();
		for(User u:users)
		{
			userDTOs.add(u.convertEntityToDTO(u));
		}
		return userDTOs;
	}

}
