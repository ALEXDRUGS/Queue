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
        Product egg = new Product("Яйцо", 120.0, 1.5);
        Product apple = new Product("Яблоко", 120.0, 1.5);
        Product butter = new Product("Масло", 120.0, 1.5);
        Product meat = new Product("Мясо", 120.0, 1.5);

        SetProduct setProduct = new SetProduct();

        setProduct.addProduct(banana);
        setProduct.addProduct(egg);
        setProduct.addProduct(apple);
        setProduct.addProduct(butter);
        setProduct.addProduct(meat);

        System.out.println(setProduct);

    }
}
