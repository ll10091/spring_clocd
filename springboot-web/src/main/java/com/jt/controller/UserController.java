package com.jt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.jt.pojo.User;
import com.jt.service.UserService;

@Controller//需要跳转页面
public class UserController {
	
	@Autowired
	private UserService userService;
	
	//用户通过localhost:8090/findAll获取用户数据
	@RequestMapping("/findAll")
	public String findAll(Model model) {
		List<User> userList =
				userService.findAll();	
		//model底层将数据保存到request域中
		model.addAttribute("userList",userList);
		return "userList"; //逻辑名称
	}
	
	//用户新增
	public int insertUser(User user) {
		
		return userService.insertUser(user);
	}
	
	
	public int updateUser(User user) {
		
		return userService.updateUser(user);
	}
	
	
	
	
	
	
	
	
}
