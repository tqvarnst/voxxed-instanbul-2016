package com.example.service;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {

	public String sayHello() {
//		return "hello"; //English
//		return "hej"; // Swedish
// 		return "marhaba"; // Arabic
// 		return "merhaba"; // Turkish
//		return "hole"; // Spanish
		return "namaste"; // Hindi
//		return "konnichiwa"; //Japanese
	}

}
