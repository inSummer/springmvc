package com.wyh.springmvc.controller;


import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wyh.springmvc.pojo.Item;

/**
 * 
 * @author Cotton
 *
 */
@Controller
public class ItemsController {
	@RequestMapping("/queryItems")
	public ModelAndView queryItems()throws Exception{
		ModelAndView mv = new ModelAndView();
		ArrayList<Item> itemList = new ArrayList<Item>();
		
		Item items_1 = new Item();
		items_1.setName("联想笔记本");
		items_1.setPrice(6000f);
		items_1.setDetail("ThinkPad T430 联想笔记本电脑！");
		
		Item items_2 = new Item();
		items_2.setName("苹果手机");
		items_2.setPrice(5000f);
		items_2.setDetail("iphone6苹果手机！");
		
		itemList.add(items_1);
		itemList.add(items_2);
		
		mv.addObject("itemsList", itemList);
		//mv.setViewName("itemList");
//		String str = "abc";
//		mv.addObject("str",str);
		mv.setViewName("itemList");
		return mv;
		
	}
	
}
