package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.repository.BackendRecipeRespository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class BackendRecipeApplication {

	@Autowired
	BackendRecipeRespository backendRecipeRespository;

	public static void main(String[] args) {
		SpringApplication.run(BackendRecipeApplication.class, args);
	}

}
