package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodsController {
	
	@GetMapping("/insertGoods")
	public String insertGoods(HttpServletRequest request) {
		String str = "ok";
		System.out.println("상품을 등록하였습니다");
		return str;
	}
	
	@GetMapping("/updateGoods")
	public String updateGoods(HttpServletRequest request) {
		String str = "ok";
		System.out.println("상품을 수정하였습니다");
		return str;
	}
}
