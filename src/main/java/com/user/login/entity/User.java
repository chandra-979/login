package com.user.login.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.user.login.dto.UserDTO;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;
	private String name;
	private String mailId;
	private String password;
	private Long phoneNo;
	private String location;
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public UserDTO convertEntityToDTO(User user)
	{
		UserDTO userDTO=new UserDTO();
		userDTO.setLocation(user.getLocation());
		userDTO.setMailId(user.getMailId());
		userDTO.setName(user.getName());
		userDTO.setPassword(user.getPassword());
		userDTO.setPhoneNo(user.getPhoneNo());
		userDTO.setUserId(user.getUserId());
		return userDTO;
	}
	

}
