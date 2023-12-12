package gof.structural.decorator.pizza;

import gof.structural.decorator.ToppingDecorator;

public class Mozzarella extends ToppingDecorator {
    public Mozzarella(Pizza newPizza) {
        super(newPizza);
        System.out.println("Adding mozzarella");
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription() + ", Mozzarella";
    }

    @Override
    public Double getCost() {
        return tempPizza.getCost() + 0.5;
    }

    @Override
    public Pizza addTopping(Pizza pizza) {
        return new Mozzarella(pizza);
    }
}
