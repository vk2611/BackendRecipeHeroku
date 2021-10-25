package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Recipe;
import com.example.service.BackendRecipeService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class BackendRecipeController {

	@Autowired
	private BackendRecipeService backendRecipeService;

	@GetMapping("/")
	public List<Recipe> getAllRecipe() {
		return backendRecipeService.getAllRecipe();

	}

	@GetMapping("/id")
	public Recipe getById(@RequestBody int id) {
		return backendRecipeService.getRecipeById(id);

	}

	@PostMapping("/save")
	public String save(@RequestBody List<Recipe> recipe) {
		log.info("inside");
		backendRecipeService.saveData(recipe);
		return "Saved Successfull";
	}

	@DeleteMapping("/delete")
	public String deleteAll() {
		backendRecipeService.deleteAll();
		return "Deleted Successfull";
	}
}
