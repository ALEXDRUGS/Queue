package product;

import java.util.Objects;

public class Recipe {
    private String nameRecipe;
    private final SetProduct<Product> productLinkedList;
    private double sumCost;

    public Recipe(String nameRecipe, SetProduct<Product> productLinkedList, double sumCost) {
        super();
        this.nameRecipe = nameRecipe;
        this.productLinkedList = productLinkedList;
        this.sumCost = sumCost;
    }

    public SetProduct<Product> getSetProduct() {
        return productLinkedList;
    }

    public double getSumCost(SetProduct<Product> productLinkedList) {
        productLinkedList.getSum();
        return sumCost;
    }

    public void setSumCost(double sumCost) {
        this.sumCost = sumCost;
    }

    public String getNameRecipe() {
        return nameRecipe;
    }

    public void setNameRecipe(String nameRecipe) {
        this.nameRecipe = nameRecipe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Recipe recipe = (Recipe) o;
        return nameRecipe.equals(recipe.nameRecipe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nameRecipe);
    }

    @Override
    public String toString() {
        return "Название рецепта " + nameRecipe + " список ингредиентов " + productLinkedList + " итоговая стоимость " + productLinkedList.getSum() + " руб";
    }
}
