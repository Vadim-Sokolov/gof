package gof.creational.factory.recipe;

public class MeatLoafRecipe implements Recipe {
    @Override
    public void becomeFood() {
        System.out.println("Fuse ingredients to become MEAT LOAF");
    }
}
