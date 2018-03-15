package org.zhuiyi.yiconnect.data.transfer.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.zhuiyi.yiconnect.data.transfer.domain.Session;
import org.zhuiyi.yiconnect.data.transfer.dto.response.base.R;
import org.zhuiyi.yiconnect.data.transfer.service.SessionService;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/session")
public class SessionController {
	@Autowired
	private SessionService sessionService;
	
	/**
	 * 测试分页插件
	 * @return
	 */
	@GetMapping("")
	public R list(@RequestParam(required=false) Map<String,Object> params){
		PageInfo<Session> sessions = this.sessionService.queryAll(params);
		return R.ok().put("sessions", sessions);
	}
	
	
	
}
