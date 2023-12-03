package gof.creational.abstractfactory;

import gof.creational.abstractfactory.cuisine.AmericanCuisine;
import gof.creational.abstractfactory.cuisine.Cuisine;
import gof.creational.abstractfactory.cuisine.ItalianCuisine;
import gof.creational.abstractfactory.cuisine.JapaneseCuisine;
import gof.creational.abstractfactory.lunch.AmericanLunch;
import gof.creational.abstractfactory.lunch.ItalianLunch;
import gof.creational.abstractfactory.lunch.JapaneseLunch;
import gof.creational.abstractfactory.lunch.Lunch;

public class LunchAbstractFactory {

    public Lunch getLunch(Cuisine cuisine) throws CafeException {
        if (cuisine instanceof JapaneseCuisine) {
            return new JapaneseLunch();
        }
        if (cuisine instanceof ItalianCuisine) {
            return new ItalianLunch();
        }
        if (cuisine instanceof AmericanCuisine) {
            return new AmericanLunch();
        }
        throw new CafeException("Can not cook lunch for unknown cuisine");
    }
}
