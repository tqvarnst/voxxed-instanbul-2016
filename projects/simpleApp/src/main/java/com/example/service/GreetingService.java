package com.example.service;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {

	public String sayHello() {
		return String.format("%s from JBoss EAP %s on %s using %s %s", 
				this.getInternationalHello(),
				System.getenv("JBOSS_EAP_VERSION"),
				System.getenv("HOSTNAME"),
				System.getenv("JAVA_VENDOR"),
				System.getenv("JAVA_VERSION"));
		
	}
	
	private String getInternationalHello() {
//		return "Hello"; //English
		return "Hej"; // Swedish
// 		return "Marhaba"; // Arabic
// 		return "Merhaba" + System.getenv("HOSTNAME"); // Turkish
//		return "Hola"; // Spanish
//		return "Namaste"; // Hindi
//		return "Konnichiwa"; //Japanese
	}

}
