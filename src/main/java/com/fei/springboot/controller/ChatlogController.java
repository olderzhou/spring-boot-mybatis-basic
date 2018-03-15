package com.fei.springboot.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fei.springboot.domain.ChatLog;
import com.fei.springboot.dto.response.base.R;
import com.fei.springboot.service.ChatLogService;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/chatlog")
public class ChatlogController {
	@Autowired
	private ChatLogService chatLogService;
	
	/**
	 * 测试分页插件
	 * @return
	 */
	@GetMapping("")
	public R list(@RequestParam(required=false) Map<String,Object> params){
		PageInfo<ChatLog> chatlogs = this.chatLogService.queryAll(params);
		return R.ok().put("chatlogs", chatlogs);
	}
	
	
	
}
