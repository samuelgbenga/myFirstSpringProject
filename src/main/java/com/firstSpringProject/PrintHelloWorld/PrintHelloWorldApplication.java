package com.firstSpringProject.PrintHelloWorld;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class PrintHelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrintHelloWorldApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx){
		return args -> {
			System.out.println("lets see the beans provided by spring boot by default");

			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			//Arrays.stream(beanNames).forEach(System.out::println);

		};
	}

}
