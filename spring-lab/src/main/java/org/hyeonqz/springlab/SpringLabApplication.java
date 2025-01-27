package org.hyeonqz.springlab;

import java.util.Arrays;

import org.hyeonqz.springlab.annotation.CustomBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;

import jakarta.annotation.PostConstruct;

@EnableCaching
@SpringBootApplication
public class SpringLabApplication {

	private final ApplicationContext applicationContext;

	public SpringLabApplication (ApplicationContext applicationContext) {
		this.applicationContext = applicationContext;
	}

	@PostConstruct
	public void init() {
		if (applicationContext.containsBean("annotationService")) {
			System.out.println("AnnotationService is successfully registered.");
		} else {
			System.out.println("AnnotationService is NOT registered.");
		}
	}

	public static void main (String[] args) {
		SpringApplication.run(SpringLabApplication.class, args);
	}

}
