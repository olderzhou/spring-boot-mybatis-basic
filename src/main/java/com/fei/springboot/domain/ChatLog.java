package com.fei.springboot.domain;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ChatLog implements Serializable{

	/**
	 * serialVersionUID:TODO（用一句话描述这个变量表示什么）
	 * 
	 * @since Ver 1.1
	 */
	private static final long serialVersionUID = 1L;
	
	private String appID;
	@JsonProperty("date_sign")
	private String dateSign;
	@JsonProperty("sessionID")
	private String sessionID;
	@JsonProperty("userID")
	private String userID;
	@JsonProperty("serviceID")
	private String serviceID;
	private String 	seq;
	@JsonProperty("currentTime")
	private String currentTime;
	private String timestamp;
	private String identity;
	private String cmd;
	private String content;
	private String code;
	private String data;

}
