package com.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;

import com.test.dao.GoodsDao;
import com.test.service.GoodsService;

@Service
public class GoodsServieImpl implements GoodsService{

	@Autowired
	private GoodsDao goodsDao;
	
	@Override
	public void insertGoods(String ip) {
		System.out.println("ip =====" +ip);

	}

}
