package ru.valiev.lesson23;

import java.util.ArrayList;
import java.util.List;


public class CustomerBasket implements Basket {
    private List<Product> products = new ArrayList<>();

    private Product getProduct (String name) {
        for (Product pr : products) {
            if (pr.getName().equals(name)) {
            return  pr;
            }
        }
        return null;
    }

    @Override
    public void addProduct(String productName, int quantity) {

       Product product = getProduct(productName);
       if (product == null) {
           product = new Product(productName,quantity);
           products.add(product);
       }
         product.setQuantity(product.getQuantity() + quantity);
    }

    @Override
    public void removeProduct(String product) {
        products.removeIf(p -> p.getName().equals(product));

    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        for (Product pr : products) {
            if (pr.getName().equals(product)) {
                pr.setQuantity(quantity);
                return;
            }
        }
        System.out.printf("Продукт %s отсутствует в корзине.\n", product);
    }

    @Override
    public void clear() {
        products.clear();
    }

    @Override
    public List<String> getProducts() {
        List<String> basketList = new ArrayList<>();
        for (Product prod : products) {
            basketList.add(prod.getName());
        }
        return basketList;
    }

    @Override
    public int getProductQuantity(String product) {
        for (Product pr : products) {
            if (pr.getName().equals(product)) {
                return pr.getQuantity();
            }
        }
        System.out.printf("Продукт %s отсутствует в корзине.\n", product);
        return 0;
    }

    @Override
    public String toString() {
        return "Товары в корзине:\n " + products;
    }
}