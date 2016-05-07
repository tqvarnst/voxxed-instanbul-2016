package com.example.service;

import static org.junit.Assert.*;

import org.junit.Test;

public class GreetingServiceTest {

	@Test
	public void testSayHello() {
		GreetingService service = new GreetingService();
		String helloStr = service.sayHello();
		assertTrue(helloStr.length()>0);
		System.out.println(helloStr);
	}

}
