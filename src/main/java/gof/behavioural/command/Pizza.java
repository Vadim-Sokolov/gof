package gof.behavioural.command;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Map;

@Getter
@AllArgsConstructor
// RECEIVER
public class Pizza {

    public final Map<Ingredient, Integer> ingredients;

    public void addBacon() {
        ingredients.put(Ingredient.BACON, ingredients.getOrDefault(Ingredient.BACON, 0) + 1);
    }

    public void removeBacon() {
        var currentCount = ingredients.getOrDefault(Ingredient.BACON, 0);
        if (currentCount > 0) {
            ingredients.put(Ingredient.BACON, currentCount - 1);
        } else {
            ingredients.put(Ingredient.BACON, 0);
        }
    }

    public void addCheese() {
        ingredients.put(Ingredient.CHEESE, ingredients.getOrDefault(Ingredient.CHEESE, 0) + 1);
    }

    public void removeCheese() {
        var currentCount = ingredients.getOrDefault(Ingredient.CHEESE, 0);
        if (currentCount > 0) {
            ingredients.put(Ingredient.CHEESE, currentCount - 1);
        } else {
            ingredients.put(Ingredient.CHEESE, 0);
        }
    }

    public void addMushrooms() {
        ingredients.put(Ingredient.MUSHROOMS, ingredients.getOrDefault(Ingredient.MUSHROOMS, 0) + 1);
    }

    public void removeMushrooms() {
        var currentCount = ingredients.getOrDefault(Ingredient.MUSHROOMS, 0);
        if (currentCount > 0) {
            ingredients.put(Ingredient.MUSHROOMS, currentCount - 1);
        } else {
            ingredients.put(Ingredient.MUSHROOMS, 0);
        }
    }

    public void addTomato() {
        ingredients.put(Ingredient.TOMATO, ingredients.getOrDefault(Ingredient.TOMATO, 0) + 1);
    }

    public void removeTomato() {
        var currentCount = ingredients.getOrDefault(Ingredient.TOMATO, 0);
        if (currentCount > 0) {
            ingredients.put(Ingredient.TOMATO, currentCount - 1);
        } else {
            ingredients.put(Ingredient.TOMATO, 0);
        }
    }
}
