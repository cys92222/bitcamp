package com.example.demo.controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.GoodsDao;
@Controller
public class GoodsController {
	@Autowired
	private GoodsDao dao;

	public void setDao(GoodsDao dao) {
		this.dao = dao;
	}
	
	@RequestMapping("/deleteGoods.do")
	public ModelAndView deleteGoods(int no) {
		ModelAndView mav = new ModelAndView();
		int re = dao.deleteGoods(no);
		mav.addObject("delete", re);
		mav.setViewName("redirect:/listGoods.do");
		return mav;
	}
	
	@RequestMapping("/detailGoods.do")
	public ModelAndView detailGoods(int no ,HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		System.out.println(request.getRealPath("img"));
		mav.addObject("detail", dao.detailGoods(no));
		return mav;
	}
	
	@RequestMapping("/listGoods.do")
	public ModelAndView listGoods(String search,String combo) {
		ModelAndView mav = new ModelAndView();
		if(combo == null) {
			combo = "";
		}
		if(search == null) {
			search = "";
		}
		System.out.println(combo);
		System.out.println(search);
		
		HashMap map = new HashMap();
		map.put("search", search);
		map.put("combo", combo);
			
		mav.addObject("list",dao.goodsList(map));
		System.out.println(dao.goodsList(map));
		return mav;
	}
}
