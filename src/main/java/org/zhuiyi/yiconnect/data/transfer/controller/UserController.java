package org.zhuiyi.yiconnect.data.transfer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;

import org.zhuiyi.yiconnect.data.transfer.domain.User;
import org.zhuiyi.yiconnect.data.transfer.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/hello")
	@ResponseBody
	public String hello(){
		return "hello";
	}
	/**
	 * 测试插入
	 * @return
	 */
	@RequestMapping("/add")
	@ResponseBody
	public String add(){
		User u = new User();
		double i = Math.random()*100;
		u.setId(String.valueOf(i));
		u.setUserName("test"+i);
		this.userService.insertUser(u);
		return "success";
	}
	/**
	 * 测试分页插件
	 * @return
	 */
	@RequestMapping("/queryPage")
	@ResponseBody
	public String queryPage(){
		PageInfo<User> page = this.userService.queryPage("tes", 1, 2);
		System.out.println("总页数=" + page.getPages());
		System.out.println("总记录数=" + page.getTotal()) ;
		for(User u : page.getList()){
			System.out.println(u.getId() + " \t " + u.getUserName());
		}
		return "success";
	}
	/**
	 * 测试事务
	 * @return
	 */
	@RequestMapping("/testTransational")
	@ResponseBody
	public String test(){
		try {
			this.userService.testTransational();
			return "success";
		} catch (Exception e) {
			return e.getMessage();
		}
		
	}
}
