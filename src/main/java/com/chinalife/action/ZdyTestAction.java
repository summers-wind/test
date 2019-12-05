package com.chinalife.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chinalife.service.IZdyTestService;
import com.google.gson.Gson;

@Controller
public class ZdyTestAction {

	@Resource
	private IZdyTestService service;
	
	@ResponseBody
	@RequestMapping("getData")
	public String getData(){
		return new Gson().toJson(service.getData());
	}
	
}
