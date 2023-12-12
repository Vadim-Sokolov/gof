package gof.structural.decorator;

import gof.structural.decorator.pizza.Pizza;
import gof.structural.decorator.pizza.PlainPizza;

import java.util.List;

public class Kitchen {

    public Pizza cookPizza(List<ToppingDecorator> toppings) {
        Pizza pizza = new PlainPizza();

        for (ToppingDecorator topping : toppings) {
            pizza = topping.addTopping(pizza);
        }
        return pizza;
    }
}
