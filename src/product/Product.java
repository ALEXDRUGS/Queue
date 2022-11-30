package product;

import java.util.Objects;

public class Product {
    private final String name;
    private final Double cost;
    private final double weight;

    public Product(String name, Double cost, double weight) {
        this.name = name;
        this.cost = cost;
        this.weight = weight;
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.weight, weight) == 0 && name.equals(product.name) && cost.equals(product.cost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cost, weight);
    }

    @Override
    public String toString() {
        return "Продукт " + name + " цена " + cost + " вес " + weight + " кг ";
    }

    public static void main(String[] args) {

        Product banana = new Product("Банан", 100.0, 1.5);
        Product egg = new Product("Яйцо", 12.0, 1.5);
        Product apple = new Product("Яблоко", 10.0, 1.5);
        Product butter = new Product("Масло", 2.0, 1.5);
        Product meat = new Product("Мясо", 40.0, 1.5);

        SetProduct<Product> setProduct = new SetProduct<>();

        setProduct.addProduct(egg);
        setProduct.addProduct(banana);
        setProduct.addProduct(apple);
        setProduct.addProduct(butter);
        setProduct.addProduct(meat);

        SetRecipe<Recipe> setRecipe = new SetRecipe<>();

        Recipe recipe = new Recipe(" Торт ", setProduct, setProduct.getSum());
        Recipe plov = new Recipe(" Плов ", setProduct, setProduct.getSum());
        Recipe borsh = new Recipe(" Борщ ", setProduct, setProduct.getSum());
        Recipe salat = new Recipe(" Салат ", setProduct, setProduct.getSum());

        setRecipe.addRecipe(recipe);
        setRecipe.addRecipe(plov);
        setRecipe.addRecipe(borsh);
        setRecipe.addRecipe(salat);
        setRecipe.addRecipe(salat);

        System.out.println(setRecipe);

    }
}
