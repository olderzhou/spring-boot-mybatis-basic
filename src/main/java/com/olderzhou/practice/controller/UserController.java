package com.olderzhou.practice.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.olderzhou.practice.domain.User;
import com.olderzhou.practice.dto.response.base.R;
import com.olderzhou.practice.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	/**
	 * 测试分页插件
	 * @return
	 */
	@GetMapping("")
	public R list(@RequestParam(required=false) Map<String,Object> params){
		PageInfo<User> users = userService.queryAll(params);
		return R.ok().put("chatlogs", users);
	}
	
	
	
}
