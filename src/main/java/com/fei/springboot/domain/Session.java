package com.fei.springboot.domain;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Session implements Serializable{

	/**
	 * serialVersionUID:TODO（用一句话描述这个变量表示什么）
	 * 
	 * @since Ver 1.1
	 */
	private static final long serialVersionUID = 1L;
	@JsonProperty("date_sign")
	private String dateSign            ;
	private String appID                ;
	private String sessionID            ;
	private String userID               ;
	private String serviceID            ;
	private String sessionType          ;
	private String sessionStage         ;
	private String timestamp            ;
	private String evaluation           ;
	private String remark               ;
	private String channel              ;
	private String userIP               ;
	private String userAddress          ;
	private String startTime            ;
	private String endType              ;
	private String qualityStandardScore ;
	private String qualityAddScore      ;
	private String qualityComment       ;
	@JsonProperty("extends")
	private String extendsInfo              ;
	private String evaluationText       ;
	private String evaluationTags       ;


}
