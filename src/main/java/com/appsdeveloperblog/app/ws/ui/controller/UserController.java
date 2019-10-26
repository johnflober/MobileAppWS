package com.appsdeveloperblog.app.ws.ui.controller;

<<<<<<< HEAD
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
=======
<<<<<<< HEAD
import org.springframework.web.bind.annotation.*;
=======
>>>>>>> fdbd30200b6a1a4285a89dc2cf4b083f47a25c33
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
>>>>>>> a9af1c8f0d479821ed0ec76d987b8aff43698bcf

import com.appsdeveloperblog.app.ws.service.UserService;
import com.appsdeveloperblog.app.ws.shared.dto.UserDto;
import com.appsdeveloperblog.app.ws.ui.model.request.UserDetailsRequestModel;
import com.appsdeveloperblog.app.ws.ui.model.response.UserRest;

@RestController
@RequestMapping("users") //http://localhost:8080/users
public class UserController {
<<<<<<< HEAD

    @GetMapping
    public String getUser(){
        return "get user was called";
    }

    @PostMapping
    public String createUser(){
        return "create user was called";
    }

    @PutMapping
    public String updateUser(){
        return "update user was called";
    }

    @DeleteMapping
    public  String deleteUser(){
        return "delete user was called";
    }
=======
	
	@Autowired
	UserService userService;
	
	@GetMapping
	public String getUser() {
		return "get user was called";
	}
	
	@PostMapping
	public UserRest createUser(@RequestBody UserDetailsRequestModel userDetails) {
		
		UserRest returnValue = new UserRest();
		
		UserDto userDto = new UserDto();
		BeanUtils.copyProperties(userDetails,  userDto);
		
		UserDto createdUser = userService.createUser(userDto);
		BeanUtils.copyProperties(createdUser, returnValue);
		
		return returnValue;
	}
	
	@PutMapping
	public String updateUser() {
		return "update user was called";
	}
	
	@DeleteMapping
	public String deleteUser() {
		return "delete user was called";
	}
>>>>>>> a9af1c8f0d479821ed0ec76d987b8aff43698bcf

}
