package gof.structural.decorator.pizza;

import gof.structural.decorator.ToppingDecorator;

public class Seafood extends ToppingDecorator {
    public Seafood(Pizza newPizza) {
        super(newPizza);
        System.out.println("Adding seafood");
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription() + ", Seafood";
    }

    @Override
    public Double getCost() {
        return tempPizza.getCost() + 2;
    }

    @Override
    public Pizza addTopping(Pizza pizza) {
        return new Seafood(pizza);
    }
}
