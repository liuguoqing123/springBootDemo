package com.hsbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hsbc.bean.Demo;
import com.hsbc.mapper.DemoMapper;

@Service
public class DemoService {
	@Autowired
	DemoMapper demoMapper;
	
	@Transactional
	public int save(Demo demo){
		return demoMapper.save(demo);
	}
	
	@Transactional
	public int delete(int id){
		return demoMapper.delete(id);
	}
	
	@Transactional
	public int update(Demo demo){
		return demoMapper.update(demo);
	}
	
	@Transactional
	public int update2(Demo demo){
		return demoMapper.update2(demo);
	}
	
	public List<Demo> selectAll(){
		return demoMapper.selectAll();
	}
	
	public Demo selectById(int id){
		return demoMapper.selectById(id);
	}
	
	public List<Demo> select1(String name , String updateTime){
		return demoMapper.select1(name , updateTime);
	}
	
	public List<Demo> select2(String name , String updateTime){
		return demoMapper.select2(name , updateTime);
	}
	
	public List<Demo> select3(List id){
		return demoMapper.select3(id);
	}
	
}
