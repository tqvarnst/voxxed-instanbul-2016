package com.example.service;

import static org.junit.Assert.*;

import org.junit.Test;

public class GreetingServiceTest {

	@Test
	public void testSayHello() {
		GreetingService service = new GreetingService();
		assertTrue("hola".equals(service.sayHello()));
	}

}
