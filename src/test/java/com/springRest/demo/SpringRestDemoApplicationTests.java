package com.springRest.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.springRest.demo.services.CourseService;


@SpringBootTest
class SpringRestDemoApplicationTests {
	
	@Autowired
	public CourseService courseService;
	

	@Test
	void contextLoads() {
	}
	
	@Test
	public void serviceTest() {
		String className = this.courseService.getClass().getName();
		String packageName = this.courseService.getClass().getPackageName();
		
		System.out.println(className);
		System.out.println(packageName);
	}
	


}
