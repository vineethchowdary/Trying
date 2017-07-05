package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.User;
import com.example.service.UserService;
import com.example.serviceimpl.UserServiceImpl;

@Controller
public class MainController {

	public UserService userService;
	
	
   @Autowired
	public MainController(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping("/vinu")
	public String sayHello()
	{
		return "welcome to heroku";
	}
	
	@RequestMapping("/register")
	public String sendForm(User user,Model model)
	{
	
		model.addAttribute("user",new User());
		return "index";
	}
	
	@RequestMapping("/registersubmit")
	public String getSave(User user)
	{
		userService.save(user);
		return "success";
	}
	
	@RequestMapping("/list")
	public String getUsers(Model model)
	{
		model.addAttribute("list",userService.findAll());
		return "list";
	}
}
