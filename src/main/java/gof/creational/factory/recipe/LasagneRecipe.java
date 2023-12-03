package gof.creational.factory.recipe;

public class LasagneRecipe implements Recipe {
    @Override
    public void becomeFood() {
        System.out.println("Fuse ingredients to become LASAGNE");
    }
}
