package org.zhuiyi.yiconnect.data.transfer.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.zhuiyi.yiconnect.data.transfer.dao.ChatLogMapper;
import org.zhuiyi.yiconnect.data.transfer.domain.ChatLog;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class ChatLogService {

	@Autowired
	private ChatLogMapper chatLogMapper;
	
	
	public PageInfo<ChatLog> queryAll(Map<String, Object> params){
		Double pageNum = Double.parseDouble((String)params.get("pageNum"));
		Double pageSize =  Double.parseDouble((String)params.get("pageSize"));
				
		
		Page<ChatLog> page = PageHelper.startPage(pageNum == null ? 0: pageNum.intValue() , pageSize == null ? 20:pageSize.intValue());
		//PageHelper会自动拦截到下面这查询sql
		this.chatLogMapper.queryAll(params);
		return page.toPageInfo();
	}
	
	
	
}
