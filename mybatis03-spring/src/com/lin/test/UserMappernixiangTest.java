package com.lin.test;

import static org.junit.Assert.fail;

import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lin.nixiang.mapper.UserMapper;
import com.lin.nixiang.pojo.User;
import com.lin.nixiang.pojo.UserExample;
import com.lin.nixiang.pojo.UserExample.Criteria;


/*
*@author linone
*/
public class UserMappernixiangTest {

private ApplicationContext applicationContext;
	
	@Before
	public void init() {
		applicationContext =  new ClassPathXmlApplicationContext("applicationContext.xml");
	}

	@Test
	public void testInsertSelective() {
		UserMapper userMapper = applicationContext.getBean(UserMapper.class);
		User record =new User();
		record.setUsername("linone");
		record.setBirthday(new Date());
		userMapper.insertSelective(record);
	}

	@Test
	//测试模糊查询
	public void testSelectByExample() {
		UserMapper userMapper = applicationContext.getBean(UserMapper.class);
	    UserExample example = new UserExample();
	    Criteria createCriteria = example.createCriteria();
	    createCriteria.andUsernameLike("%lin%");
	    createCriteria.andSexEqualTo("1");
	    //创建User对象扩展类，再创建Criteria 用来设置用户查询条件
		List<User> list = userMapper.selectByExample(example);
		for (User user : list) {
			System.out.println(user);
		}
	}

	@Test
	//通过主键查询
	public void testSelectByPrimaryKey() {
		UserMapper mapper = applicationContext.getBean(UserMapper.class);
		User user = mapper.selectByPrimaryKey(20);
		System.out.println(user);
		
	}

}
