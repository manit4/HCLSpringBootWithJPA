package com.hcl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.entity.User;
import com.hcl.service.IUserService;

import ch.qos.logback.core.model.Model;

@Controller
public class UserController {
	
	@Autowired
	IUserService service;

	@GetMapping("/registrationPage")
	public String registrationPage() {
		
		return "registration_page";
	}
	
//	@PostMapping("/register")
//	public ModelAndView registerUser(String uname, String pwd, String name, String email) {
//			
//		System.out.println("inside registrationPage()..."+uname+", "+pwd+", "+name+", "+email);
//		
//		User user = new User(uname, pwd, name, email);
//		
//		service.addUser(user);
//		
//		ModelAndView modelAndView = new ModelAndView("index");
//		
//		modelAndView.addObject("registrationmessage", "Thanks for Registering with US!!");
//		
//		return modelAndView;
//	}
	
	@PostMapping("/register")
	public ModelAndView registerUser(User user) {
			
		System.out.println("inside registrationPage()..."+user.getUsername()+", "+user.getPassword()+", "+user.getName()+", "+user.getEmail());
		
		service.addUser(user);
		
		ModelAndView modelAndView = new ModelAndView("index");
		
		modelAndView.addObject("registrationmessage", "Thanks for Registering with US!!");
		
		return modelAndView;
	}
	
//	@PostMapping("/login")
//	public String login(String uname, String pwd) {
//		
//		System.out.println("inside login() "+uname+", "+pwd);
//		
//		User user = service.find(uname);
//		
//		if(user != null) {
//			
//			if(user.getPassword().equals(pwd)) {
//				return "welcome";
//			}
//			else {
//				return "index";
//			}
//		}
//		else {
//			
//			return "index";
//		}
//	}
	
	
//	@PostMapping("/login")
//	public String login(String uname, String pwd) {
//		
//		System.out.println("inside login() "+uname+", "+pwd);
//		
//		User user = service.find(uname, pwd);
//		
//		if(user != null) {
//			
//			return "welcome";
//		}
//		else {
//			return "index";
//		}
//	}
	
	
	
	@PostMapping("/login")
	public ModelAndView login(String uname, String pwd) {
		
		System.out.println("inside login() "+uname+", "+pwd);
		
		User user = service.find(uname, pwd);
		
		if(user != null) {
			
			ModelAndView modelAndView = new ModelAndView("welcome");
			return modelAndView;
		}
		else {
			
			ModelAndView modelAndView = new ModelAndView("index");
			modelAndView.addObject("loginErrorMessage", "Wrong Credentials, please try again!!!");
			
			return modelAndView;
		}
	}
	
	
	
}
