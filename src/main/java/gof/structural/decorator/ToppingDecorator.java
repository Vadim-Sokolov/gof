package gof.structural.decorator;

import gof.structural.decorator.pizza.Pizza;

public abstract class ToppingDecorator implements Pizza {

    protected Pizza tempPizza;

    public ToppingDecorator(Pizza newPizza) {
        this.tempPizza = newPizza;
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription();
    }

    @Override
    public Double getCost() {
        return tempPizza.getCost();
    }

    public abstract Pizza addTopping(Pizza pizza);
}
