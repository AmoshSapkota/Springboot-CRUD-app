package com.learning.springtutorial;

import java.lang.module.Configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringtutorialApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringtutorialApplication.class, args);
		Alien a = context.getBean(Alien.class);
		a.show();
	}
}
