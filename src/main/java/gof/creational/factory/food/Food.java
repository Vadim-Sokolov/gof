package gof.creational.factory.food;

import gof.creational.factory.recipe.Recipe;

public abstract class Food {

    private final Recipe behaviour;

    public Food(Recipe behaviour) {
        this.behaviour = behaviour;
    }

    public void cook() {
        behaviour.becomeFood();
    }
}
