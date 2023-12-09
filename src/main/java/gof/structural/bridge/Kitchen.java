package gof.structural.bridge;

import gof.structural.bridge.dish.*;

public class Kitchen {

    public Dish cookDish(Dish dish) throws RestaurantException {
        if (dish.getClass().equals(Soup.class)) {
            return cookSoup((Soup) dish);
        }

        if (dish.getClass().equals(MainCourse.class)) {
            return cookMainCourse((MainCourse) dish);
        }

        if (dish.getClass().equals(Dessert.class)) {
            return cookDessert((Dessert) dish);
        }

        if (dish.getClass().equals(Drink.class)) {
            return prepareDrink((Drink) dish);
        }
        throw new RestaurantException("Can not cook unknown dish type: " + dish.getClass().getSimpleName());
    }

    private Soup cookSoup(Soup soup) {
        return new Soup(soup.getCuisine().getRecipe().getRecipes().get(soup.getType()).getName());
    }

    private MainCourse cookMainCourse(MainCourse mainCourse) {
        return new MainCourse(mainCourse.getCuisine().getRecipe().getRecipes().get(mainCourse.getType()).getName());
    }

    private Dessert cookDessert(Dessert dessert) {
        return new Dessert(dessert.getCuisine().getRecipe().getRecipes().get(dessert.getType()).getName());
    }

    private Drink prepareDrink(Drink drink) {
        return new Drink(drink.getCuisine().getRecipe().getRecipes().get(drink.getType()).getName());
    }
}
