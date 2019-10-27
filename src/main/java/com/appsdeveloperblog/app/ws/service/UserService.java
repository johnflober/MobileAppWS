package com.appsdeveloperblog.app.ws.service;

import com.appsdeveloperblog.app.ws.shared.dto.UserDto;

//Interface for creating DB entries
public interface UserService {
	
	UserDto createUser(UserDto user);
	
}
