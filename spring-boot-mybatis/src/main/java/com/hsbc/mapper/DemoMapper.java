package com.hsbc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hsbc.bean.Demo;

public interface DemoMapper {
	
	public int save(Demo demo);
	
	public int delete(int id);
	
	public int update(Demo demo);
	
	public int update2(Demo demo);
	
	public List<Demo> selectAll();
	
	public Demo selectById(int id);
	
	public List<Demo> select1(@Param("name")String name , @Param("updateTime")String updateTime);

	public List<Demo> select2(@Param("name")String name , @Param("updateTime")String updateTime);
	
	public List<Demo> select3(List id);


}
