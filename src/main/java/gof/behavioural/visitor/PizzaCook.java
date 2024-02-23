package gof.behavioural.visitor;

import gof.behavioural.visitor.visitable.Bacon;
import gof.behavioural.visitor.visitable.Cheese;
import gof.behavioural.visitor.visitable.Mushrooms;

import java.util.ArrayList;
import java.util.List;

public class PizzaCook implements PizzaVisitor {

    private final List<String> ingredients = new ArrayList<>();

    @Override
    public void visit(Bacon bacon) {
        ingredients.add("BACON");
    }

    @Override
    public void visit(Cheese cheese) {
        ingredients.add("CHEESE");
    }

    @Override
    public void visit(Mushrooms mushrooms) {
        ingredients.add("MUSHROOMS");
    }

    public List<String> getIngredients() {
        return ingredients;
    }
}
