package com.test.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.test.bean.User;
import com.test.service.impl.UserServiceImpl;

@Controller
public class UserController {
	@Autowired 
	@Qualifier("userServiceImpl")
	 private UserServiceImpl userServiceImpl;
	
	@RequestMapping(value = "user/login", method = RequestMethod.POST)
	 public ModelAndView IndexLogin(HttpServletRequest request, Model model){
	        String userId = (String)(request.getParameter("id"));
	        User user = userServiceImpl.getUserByID(userId);
	        ModelAndView retMap = new ModelAndView(); //·µ»ØÐÂµÄModelAndView
	        model.addAttribute("user",user);
	        retMap.setViewName("index");
	        return retMap;
	    }
}
