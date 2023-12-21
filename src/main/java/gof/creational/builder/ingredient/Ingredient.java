package gof.creational.builder.ingredient;

public abstract class Ingredient {
    private Integer quantity;

    public Ingredient(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "name=" + this.getClass().getSimpleName() +
                " " +
                "quantity=" + quantity +
                '}';
    }
}
