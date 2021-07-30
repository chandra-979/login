package com.user.login.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.login.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
