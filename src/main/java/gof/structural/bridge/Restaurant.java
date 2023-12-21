package gof.structural.bridge;

import gof.structural.bridge.dish.Dish;

public class Restaurant {

    private final Kitchen kitchen;

    public Restaurant(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    public Dish cook(Dish dish) throws RestaurantException {
        return kitchen.cookDish(dish);
    }
}
