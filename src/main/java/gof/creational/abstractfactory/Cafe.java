package gof.creational.abstractfactory;

import gof.creational.abstractfactory.cuisine.Cuisine;
import gof.creational.abstractfactory.lunch.Lunch;

public class Cafe {

    private final LunchAbstractFactory lunchAbstractFactory;

    public Cafe(LunchAbstractFactory lunchAbstractFactory){
        this.lunchAbstractFactory = lunchAbstractFactory;
    }

    public Lunch makeLunch(Cuisine cuisine) throws CafeException {
        return lunchAbstractFactory.getLunch(cuisine);
    }
}
