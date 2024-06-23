/*
Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат, содержащий в себе методы initProducts (List <Product>) сохраняющий в себе список исходных продуктов и getProduct(String name)
*/
package hw1;

import java.time.LocalDate;

public class Product {
    protected String name;
    protected double price;
    protected LocalDate releaseDate;

    public Product() {}

    public Product(String name, double price, LocalDate releaseDate) {
        this.name = name;
        this.price = price;
        this.releaseDate = releaseDate;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product {name='" + name + "', price=" + price + ", releaseDate=" + releaseDate + '}';
    }
    
}