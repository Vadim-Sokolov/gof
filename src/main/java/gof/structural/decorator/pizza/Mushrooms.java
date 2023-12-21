package gof.structural.decorator.pizza;

import gof.structural.decorator.ToppingDecorator;

public class Mushrooms extends ToppingDecorator {
    public Mushrooms(Pizza newPizza) {
        super(newPizza);
        System.out.println("Adding mushrooms");
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription() + ", Mushrooms";
    }

    @Override
    public Double getCost() {
        return tempPizza.getCost() + 0.5;
    }

    @Override
    public Pizza addTopping(Pizza pizza) {
        return new Mushrooms(pizza);
    }
}
