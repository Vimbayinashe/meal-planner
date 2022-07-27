package com.example.recipes.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Objects;

@Document("recipes")
public class Recipe {

    @Id
    private String id;

    @Indexed(unique = true)
    private String name;

    private List<String> ingredients;
    private List<String> instructions;
    private int difficulty;

    public Recipe() {
    }

    public Recipe(String name, List<String> ingredients, List<String> instructions, int difficulty) {
        this.name = name;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.difficulty = difficulty;
    }

    public String getId() {
        return id;
    }

    public Recipe setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Recipe setName(String name) {
        this.name = name;
        return this;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public Recipe setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
        return this;
    }

    public List<String> getInstructions() {
        return instructions;
    }

    public Recipe setInstructions(List<String> instructions) {
        this.instructions = instructions;
        return this;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public Recipe setDifficulty(int difficulty) {
        this.difficulty = difficulty;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Recipe recipe)) return false;
        return Objects.equals(id, recipe.id) && Objects.equals(name, recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
