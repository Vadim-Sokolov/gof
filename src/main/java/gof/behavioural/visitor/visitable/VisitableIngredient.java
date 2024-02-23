package gof.behavioural.visitor.visitable;

import gof.behavioural.visitor.PizzaVisitor;

public interface VisitableIngredient {

    void accept(PizzaVisitor visitor);
}
