package com.leepantam.s2;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*-context.xml"})
public class MyTestCase {
	@Autowired
	private Car car;
	
	@Test
	public void test1() {
		System.out.println(car.getEngine().getFuel());
	}
	
	

}
