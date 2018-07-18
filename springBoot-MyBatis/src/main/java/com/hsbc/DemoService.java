package com.hsbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DemoService {
	@Autowired
	private DemoMapper demoMapper;
	
	public List <Demo> likeName(String name){
		return demoMapper.likeName(name);
	}
	@Transactional
	public void save(Demo demo){
		demoMapper.save(demo);
	}
}
