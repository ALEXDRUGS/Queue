package product;

import java.util.Objects;

public class Recipe {
    private final String nameRecipe;
    private final HashMapProduct<Product, Integer> productHashMap;
    private final Double sumCost;

    public Recipe(String nameRecipe, HashMapProduct<Product, Integer> productHashMap, Double sumCost) {
        super();
        this.nameRecipe = nameRecipe;
        this.productHashMap = productHashMap;
        this.sumCost = sumCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Double.compare(recipe.sumCost, sumCost) == 0 && nameRecipe.equals(recipe.nameRecipe) && productHashMap.equals(recipe.productHashMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameRecipe, productHashMap, sumCost);
    }

    @Override
    public String toString() {
        return "Название рецепта " + nameRecipe + " список ингредиентов " + productHashMap + " итоговая стоимость " + productHashMap.getSum() + " руб ";
    }
}
