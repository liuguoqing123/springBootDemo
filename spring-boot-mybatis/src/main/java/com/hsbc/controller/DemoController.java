package com.hsbc.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.hsbc.bean.Demo;
import com.hsbc.service.DemoService;

@RestController
public class DemoController {
	@Autowired
	DemoService demoService;
	
	@GetMapping("/hello")
	public String hello(){
		return "<h1>Hello World !!!</h1>";
	}
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public Demo save(@RequestBody Demo demo){
		int rs = demoService.save(demo);  
		System.out.println("+++++++++++++++++++:"+rs);
		return demo;
	}
	
	@GetMapping("/delete")
	public int delete(int id){
		return demoService.delete(id);  
	}
	
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public Demo update(@RequestBody Demo demo){
		demoService.update(demo);  
		return demo;
	}
	
	@RequestMapping(value="/update2",method=RequestMethod.POST)
	public Demo update2(@RequestBody Demo demo){
		demoService.update2(demo);  
		return demo;
	}
	
	@GetMapping("/selectAll")
	public List<Demo> selectAll(int pageNum,int pageSize){
		PageHelper.startPage(pageNum, pageSize);
		return demoService.selectAll();
	}
	
	@GetMapping("/selectById")
	public Demo selectById(int id){
		return demoService.selectById(id);
	}
	
	@GetMapping("/select1")
	public List<Demo> select1(String name , String updateTime){
		//PageHelper.startPage(pageNum, pageSize);
		return demoService.select1(name , updateTime);
	}
	
	@GetMapping("/select2")
	public List<Demo> select2(String name , String updateTime){
		//PageHelper.startPage(pageNum, pageSize);
		return demoService.select2(name , updateTime);
	}
	
	@GetMapping("/select3")
	public List<Demo> select3(Integer [] id){
		//PageHelper.startPage(pageNum, pageSize);
		return demoService.select3(Arrays.asList(id));
	}
	
}
