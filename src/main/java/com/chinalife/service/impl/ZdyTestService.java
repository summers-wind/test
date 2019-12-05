package com.chinalife.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.chinalife.mapper.IZdyTestMapper;
import com.chinalife.service.IZdyTestService;
import com.sun.javafx.collections.MappingChange.Map;

@Service
public class ZdyTestService implements IZdyTestService{

	@Resource
	private IZdyTestMapper dao;
	
	@Override
	public List<Map<String, String>> getData() {
		return dao.getData();
	}

}
