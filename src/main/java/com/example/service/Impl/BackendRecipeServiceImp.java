package com.example.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Recipe;
import com.example.repository.BackendRecipeRespository;
import com.example.service.BackendRecipeService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class BackendRecipeServiceImp implements BackendRecipeService {

	@Autowired
	private BackendRecipeRespository backendRecipeRespository;

	@Override
	public List<Recipe> getAllRecipe() {
		return backendRecipeRespository.findAll();
	}

	@Override
	public Recipe getRecipeById(int id) {
		return backendRecipeRespository.findById(id).orElse(null);
	}

	@Override
	public void saveData(List<Recipe> recipe) {
		log.info("inside impl");
		backendRecipeRespository.saveAll(recipe);

	}

	@Override
	public void deleteAll() {
		backendRecipeRespository.deleteAll();
	}

}
