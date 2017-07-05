package com.example.service;


import java.util.List;

import com.example.domain.User;

public interface UserService {

	void save(User user);

	List<User> findAll();

}
