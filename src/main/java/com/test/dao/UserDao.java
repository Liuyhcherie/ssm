package com.test.dao;

import org.springframework.stereotype.Repository;

import com.test.bean.User;

@Repository
public interface UserDao {
	public User findUserByID(String userid);
}
