package com.olderzhou.practice.domain;

import java.io.Serializable;

import lombok.Data;

@Data
public class User implements Serializable{

	/**
	 * serialVersionUID:TODO（用一句话描述这个变量表示什么）
	 * 
	 * @since Ver 1.1
	 */
	private static final long serialVersionUID = 1L;
	
	
	private Long id;
	private String username;
	private String password;
	private String age;
	private int gender;

}
