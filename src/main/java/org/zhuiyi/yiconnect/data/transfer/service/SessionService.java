package org.zhuiyi.yiconnect.data.transfer.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.zhuiyi.yiconnect.data.transfer.dao.SessionMapper;
import org.zhuiyi.yiconnect.data.transfer.domain.Session;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class SessionService {

	@Autowired
	private SessionMapper sessionMapper;
	
	
	public PageInfo<Session> queryAll(Map<String, Object> params){
		Double pageNum = Double.parseDouble((String)params.get("pageNum"));
		Double pageSize =  Double.parseDouble((String)params.get("pageSize"));
				
		
		Page<Session> page = PageHelper.startPage(pageNum == null ? 0: pageNum.intValue() , pageSize == null ? 20:pageSize.intValue());
		//PageHelper会自动拦截到下面这查询sql
		this.sessionMapper.queryAll(params);
		return page.toPageInfo();
	}
	
	
	
}
