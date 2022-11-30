package product;

import java.util.*;

public class SetProduct<P> {
    private final Set<Product> products = new HashSet<>();

    public void addProduct(Product product) {
        boolean test = product.getName().isBlank() || product.getCost() < 0 || product.getWeight() < 0;
        if (!products.contains(product)) {
            products.add(product);
        } else throw new RuntimeException("Продукт уже был куплен");
        if (test) {
            throw new RuntimeException("Заполните карточку товара полностью");
        }
    }

    public double getSum() {
        double sum = 0;
        for (Product product : products) {
            sum += product.getCost();
        }
        return sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SetProduct<?> that = (SetProduct<?>) o;
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
