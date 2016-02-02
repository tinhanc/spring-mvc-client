package com.memo.wallet.web;

import com.memo.wallet.service.ServiceInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
public class WebInitializer {

	private final Logger logger = LoggerFactory.getLogger(WebInitializer.class);
	private final ServiceInitializer helloWorldService;

	@Autowired
	public WebInitializer(ServiceInitializer helloWorldService) {
		this.helloWorldService = helloWorldService;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Map<String, Object> model) {
		return "index";
	}


}