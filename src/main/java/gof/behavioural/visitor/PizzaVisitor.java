package gof.behavioural.visitor;

import gof.behavioural.visitor.visitable.Bacon;
import gof.behavioural.visitor.visitable.Cheese;
import gof.behavioural.visitor.visitable.Mushrooms;

public interface PizzaVisitor {

    void visit(Bacon bacon);
    void visit(Cheese cheese);
    void visit(Mushrooms mushrooms);
}
