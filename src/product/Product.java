package product;

import java.util.Objects;

public class Product {
    private final String name;
    private final Double cost;
    private final double weight;
    private final Integer amount;

    public Product(String name, Double cost, double weight, Integer amount) {
        this.name = name;
        this.cost = cost;
        this.weight = weight;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public Double getCost() {
        return cost;
    }

    public double getWeight() {
        return weight;
    }

    public Integer getAmount() {
        return amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Product product = (Product) o;
        return Double.compare(product.weight, weight) == 0 && name.equals(product.name) && cost.equals(product.cost) && amount.equals(product.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cost, weight);
    }

    @Override
    public String toString() {
        return "Продукт " + name + " цена " + cost + " вес " + weight + " кг количество ";
    }



    public static void main(String[] args) {

        HashMapProduct<Product, Integer> productHashMap = new HashMapProduct<>();

        Product banana = new Product("Банан", 10.0, 1.5, 3);
        Product egg = new Product("Яйцо", 10.0, 1.5, 2);
        Product apple = new Product("Яблоко", 10.0, 1.5, 3);
        Product butter = new Product("Масло", 10.0, 1.5, 2);
        Product meat = new Product("Мясо", 10.0, 1.5, 2);

        HashMapProduct<Product, Integer> productHashMap2 = new HashMapProduct<>();
        productHashMap2.addProduct(banana);
        productHashMap2.addProduct(apple);

        productHashMap.addProduct(egg);
        productHashMap.addProduct(banana);
        productHashMap.addProduct(apple);
        productHashMap.addProduct(butter);
        productHashMap.addProduct(meat);

        SetRecipe<Recipe> setRecipe = new SetRecipe<>();

        Recipe recipe = new Recipe(" Торт ", productHashMap2, productHashMap.getSum());
        Recipe plov = new Recipe(" Плов ", productHashMap, productHashMap.getSum());
        Recipe borsh = new Recipe(" Борщ ", productHashMap, productHashMap.getSum());
        Recipe salat = new Recipe(" Салат ", productHashMap, productHashMap.getSum());

        setRecipe.addRecipe(recipe);
        setRecipe.addRecipe(plov);
        setRecipe.addRecipe(borsh);
        setRecipe.addRecipe(salat);
        //setRecipe.addRecipe(salat);

        System.out.println(setRecipe);

    }
}
