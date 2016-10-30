package com.lslin.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lslin.entity.User;
import com.lslin.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	private static Logger log = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserService userService;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	// /user/test?id=1
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test(HttpServletRequest request, Model model) {
		userService.getUserById(1);
		return "index";
	}
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public void login(HttpServletRequest request, Model model) {
		System.out.println(request.getParameter("upass"));
	}

	@RequestMapping(value = "/getUserById", produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public User getUserByIdController(HttpServletRequest request, Model model) {
		System.out.println("ok");
		return userService.getUserById(1);
	}
}
