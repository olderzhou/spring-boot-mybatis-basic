package com.olderzhou.practice.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.olderzhou.practice.domain.User;

@Mapper
public interface UserMapper {
	
	//注：方法名和要ChatLogMapper.xml中的id一致
	List<User> queryAll(Map<String,Object> params);
	
	
	int countTotal();
	
	
	
}
