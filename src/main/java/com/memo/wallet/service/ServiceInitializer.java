package com.memo.wallet.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class ServiceInitializer {

	private static final Logger logger = LoggerFactory.getLogger(ServiceInitializer.class);

	public String getDesc() {

		logger.debug("getDesc() is executed!");

		return "MEMOWallet.";

	}

	public String getTitle(String name) {

		logger.debug("getTitle() is executed! $name : {}", name);

		if(StringUtils.isEmpty(name)){
			return "Welcome to";
		}else{
			return "Welcome " + name;
		}
		
	}

}