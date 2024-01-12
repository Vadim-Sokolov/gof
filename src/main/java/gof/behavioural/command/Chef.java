package gof.behavioural.command;

import lombok.Getter;

@Getter
// INVOKER
public class Chef {

    private final Pizza pizza;

    public Chef(Pizza pizza) {
        this.pizza = pizza;
    }

    public void addBacon() {
        pizza.addBacon();
    }

    public void removeBacon() {
        pizza.addBacon();
    }

    public void addCheese() {
        pizza.addCheese();
    }

    public void removeCheese() {
        pizza.removeCheese();
    }

    public void addMushrooms() {
        pizza.addMushrooms();
    }

    public void removeMushrooms() {
        pizza.removeMushrooms();
    }

    public void addTomato() {
        pizza.addTomato();
    }

    public void removeTomato() {
        pizza.removeTomato();
    }
}
