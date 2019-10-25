package com.appsdeveloperblog.app.ws.ui.controller;

<<<<<<< HEAD
import org.springframework.web.bind.annotation.*;
=======
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
>>>>>>> a9af1c8f0d479821ed0ec76d987b8aff43698bcf

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
	
	@GetMapping
	public String getUser() {
		return "get user was called";
	}
	
	@PostMapping
	public String createUser() {
		return "create user was called";
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
