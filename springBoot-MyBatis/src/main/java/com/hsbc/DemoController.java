package com.hsbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;

@RestController
public class DemoController {
	
	@Autowired
	private DemoService demoService;
	@RequestMapping("/likeName")
	public List <Demo> likeName(String name){
		PageHelper.startPage(1, 2);
		return demoService.likeName(name);
	}
	
	@RequestMapping("/save")
	public Demo save(String name){
		Demo demo = new Demo();
		demo.setName(name);
		demoService.save(demo);
		return demo;
	}
}
