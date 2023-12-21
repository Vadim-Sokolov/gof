package gof.structural.decorator.pizza;

public class PlainPizza implements Pizza {

    @Override
    public String getDescription() {
        return "Thin Doe";
    }

    @Override
    public Double getCost() {
        return 4.0;
    }
}
