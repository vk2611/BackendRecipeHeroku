package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Recipe")
public class Recipe {

	@Id
	private int id;

	private String name;

	private String image;

	private String category;

	private String label;

	private String price;

	private String description;
}
