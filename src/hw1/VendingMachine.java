package hw1;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    protected List<Product> products;

    public VendingMachine() {
        this.products = new ArrayList<Product>();
    }

    public VendingMachine(List<Product> products) {
        this.products = products;
    }
    
    public void addProducts (List <Product> products) {
        this.products.addAll(products);
    }

    public Product getProduct(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                Product result = product;
                products.remove(product);
                return result;
            }
        }
        System.out.println("Нет такого продукта: " + name);
        return null;
    }

    public Product getProduct(String name, int temperature, float volume) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                Product result = product;
                products.remove(product);
                return result;
            }
        }
        System.out.println("Нет такого продукта: " + name);
        return null;
    }

    public List<Product> getProducts() {
        return products;
    }
}
