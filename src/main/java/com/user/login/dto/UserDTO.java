package com.user.login.dto;

import com.user.login.entity.User;

public class UserDTO {
	
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
	
	public User convertDtoTOEntity(UserDTO userDTO)
	{
		User user=new User();
		user.setLocation(userDTO.getLocation());
		user.setMailId(userDTO.getMailId());
		user.setName(userDTO.getName());
		user.setPassword(userDTO.getPassword());
		user.setPhoneNo(userDTO.getPhoneNo());
		
		return user;
	}
	

}
