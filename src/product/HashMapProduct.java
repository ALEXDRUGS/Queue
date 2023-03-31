package product;

import java.util.*;

public class HashMapProduct<P, I extends Number> {
    private final HashMap<Product, Integer> products = new HashMap<>();

    public void addProduct(Product product) {
        boolean test = product.getName().isBlank() || product.getCost() < 0 || product.getWeight() < 0;
        if (!products.containsKey(product)) {
            products.put(product, product.getAmount());
        } else throw new RuntimeException("Продукт уже был куплен");
        if (test) {
            throw new RuntimeException("Заполните карточку товара полностью");
        }
    }

    public double getSum() {
        int amount;
        double sumCost = 0;
        for (Map.Entry<Product, Integer> productIntegerEntry : products.entrySet()) {
            sumCost = productIntegerEntry.getKey().getCost();
            amount = products.keySet().iterator().next().getAmount();
            sumCost = sumCost * amount * products.keySet().size();
        }
        return sumCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HashMapProduct<?, ?> that = (HashMapProduct<?, ?>) o;
        return products.equals(that.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products);
    }

    @Override
    public String toString() {
        return " " + products;
    }
}
