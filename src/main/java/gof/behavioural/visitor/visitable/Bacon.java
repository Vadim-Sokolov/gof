package gof.behavioural.visitor.visitable;

import gof.behavioural.visitor.PizzaVisitor;

public class Bacon implements VisitableIngredient {
    @Override
    public void accept(PizzaVisitor pizzaVisitor) {
        pizzaVisitor.visit(this);
    }
}
