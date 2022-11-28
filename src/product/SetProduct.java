package product;

import java.util.HashSet;
import java.util.Set;

public class SetProduct {
    private final Set<Product> products = new HashSet<>();

    public void addProduct(Product product) {
        boolean test = product == null || product.getName().isBlank()
                || product.getCost() < 0 || product.getWeight() < 0;
        if (!products.contains(product)) {
            products.add(product);
        } else{
            try {
                throw new RuntimeException();
            } catch (RuntimeException e) {
                throw new RuntimeException("Продукт уже был куплен");
            }
        }
        if (test) {
            throw new RuntimeException("Заполните карточку товара полностью");
        }
    }

    @Override
    public String toString() {
        return " " + products;
    }
}
