package com.ssu.hospital;

import DependenciesInjection.AppContextConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.impl.UserService;

@SpringBootApplication
public class HospitalApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalApplication.class, args);

		var config = new AnnotationConfigApplicationContext(AppContextConfig.class);

		String[] springComponents = config.getBeanDefinitionNames();
		for (String bean : springComponents)
			System.out.println(bean);

		var userService = config.getBean(UserService.class);

		var a = userService.getAll();
	}
}
