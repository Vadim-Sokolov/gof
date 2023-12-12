package gof.structural.decorator.pizza;

import gof.structural.decorator.ToppingDecorator;

public class Bacon extends ToppingDecorator {
    public Bacon(Pizza newPizza) {
        super(newPizza);
        System.out.println("Adding bacon");
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription() + ", Bacon";
    }

    @Override
    public Double getCost() {
        return tempPizza.getCost() + 1.0;
    }

    @Override
    public Pizza addTopping(Pizza pizza) {
        return new Bacon(pizza);
    }
}
