package gof.structural.decorator.pizza;

import gof.structural.decorator.ToppingDecorator;

public class Pinapple extends ToppingDecorator {
    public Pinapple(Pizza newPizza) {
        super(newPizza);
        System.out.println("Adding pineapple");
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription() + ", Pineapple";
    }

    @Override
    public Double getCost() {
        return tempPizza.getCost() + 1;
    }

    @Override
    public Pizza addTopping(Pizza pizza) {
        return new Pinapple(pizza);
    }
}
