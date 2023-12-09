package gof.creational.abstractfactory.lunch;

public abstract class Lunch {
    private final String name;

    public Lunch(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
