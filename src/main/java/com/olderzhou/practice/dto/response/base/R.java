package com.olderzhou.practice.dto.response.base;

/**   
 * 文件名：R.java   
 *   
 * 版本信息：   
 * 日期：2017年12月18日 下午3:59:22  
 * Copyright @Zhuiyi Inc 2017    
 * 版权所有   
 *   
 */   

import java.util.HashMap;
import java.util.Map;


/**   
 * 此类描述的是：   
 * @author: klauszhou@wezhuiyi.com 
 * @version: 2017年12月18日 下午3:59:22    
 */
public class R extends HashMap<String, Object> {
	private static final long serialVersionUID = 1L;
	
	public R() {
		put("code", 0);
		put("msg", "success");
	}
	
	public static R error() {
		return error(500, "未知异常，请联系管理员");
	}
	
	public static R error(String msg) {
		return error(500, msg);
	}
	
	public static R error(int code, String msg) {
		R r = new R();
		r.put("code", code);
		r.put("msg", msg);
		return r;
	}

	public static R ok(String msg) {
		R r = new R();
		r.put("msg", msg);
		return r;
	}
	
	public static R ok(Map<String, Object> map) {
		R r = new R();
		r.putAll(map);
		return r;
	}
	
	public static R ok() {
		return new R();
	}
	@Override
	public R put(String key, Object value) {
		super.put(key, value);
		return this;
	}
}