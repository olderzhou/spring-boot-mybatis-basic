package com.fei.springboot.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import com.fei.springboot.domain.Session;

@Mapper
public interface SessionMapper {
	
	//注：方法名和要ChatLogMapper.xml中的id一致
	List<Session> queryAll(Map<String,Object> params);
	
	
	int countTotal();
	
	
	
}
