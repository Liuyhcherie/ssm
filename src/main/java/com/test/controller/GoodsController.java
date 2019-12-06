package com.test.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.service.impl.GoodsServieImpl;

@Controller
public class GoodsController {
	@Autowired
	private GoodsServieImpl goodsServieImpl;
	
	@RequestMapping(value = "serach")
	 public void startSerach(HttpServletRequest request, Model model){
	        String ip = (String)(request.getParameter("ip"));
	        goodsServieImpl.insertGoods(ip);
	    }
}
