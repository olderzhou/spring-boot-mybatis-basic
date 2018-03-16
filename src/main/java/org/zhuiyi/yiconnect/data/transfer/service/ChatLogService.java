package org.zhuiyi.yiconnect.data.transfer.service;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zhuiyi.yiconnect.data.transfer.dao.ChatLogMapper;
import org.zhuiyi.yiconnect.data.transfer.domain.ChatLog;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class ChatLogService {
	private static final Logger LOGGER = LoggerFactory.getLogger(ChatLogService.class);

	@Autowired
	private ChatLogMapper chatLogMapper;
	
	
	public PageInfo<ChatLog> queryAll(Map<String, Object> params){
		LOGGER.info("params is {}:",params);
		Double pageNum = null;
		Double pageSize = null;
		try {
			pageNum = params.get("pageNum") != null?Double.parseDouble((String)params.get("pageNum")): 0;
			pageSize = params.get("pageSize")!= null?Double.parseDouble((String)params.get("pageSize")):1000;
		} catch (NumberFormatException e) {
			LOGGER.error("param parse exception {}",e);
		}
		LOGGER.info("pageNum is {}: , pageSize is {}",pageNum,pageSize);
		Page<ChatLog> page = PageHelper.startPage(pageNum == null ? 0: pageNum.intValue() , pageSize == null ? 20:pageSize.intValue());
		//PageHelper会自动拦截到下面这查询sql
		this.chatLogMapper.queryAll(params);
		return page.toPageInfo();
	}
	
	
	
}
