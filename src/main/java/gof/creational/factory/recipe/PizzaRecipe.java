package gof.creational.factory.recipe;

public class PizzaRecipe implements Recipe {
    @Override
    public void becomeFood() {
        System.out.println("Fuse ingredients to become PIZZA");
    }
}
