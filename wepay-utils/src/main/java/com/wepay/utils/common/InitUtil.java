package com.wepay.utils.common;

import javax.annotation.PostConstruct;

import com.wepay.utils.ConfigUtil;

/**
 * 初始化参数 
 */
public class InitUtil {
	@PostConstruct
	public void init() {
		//初始化微信参数
		ConfigUtil.init("wxinfo.properties");
	}

}
