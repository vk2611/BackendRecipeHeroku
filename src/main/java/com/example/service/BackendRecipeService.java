package com.example.service;

import java.util.List;

import com.example.model.Recipe;

public interface BackendRecipeService {

	public List<Recipe> getAllRecipe();

	public Recipe getRecipeById(int id);

	void saveData(List<Recipe> recipe);

	public void deleteAll();
}
