package hw1.impl;

import java.util.List;

import hw1.Product;
import hw1.VendingMachine;

public class HotDrinkVendingMachine extends VendingMachine {
    // private List<HotDrink> products;
    
    // public HotDrinkVendingMachine(List<HotDrink> hotDrinks) {
    //     this.hotDrinks = hotDrinks;
    // }

    public HotDrinkVendingMachine() {
        super();
    }

    public HotDrinkVendingMachine(List<Product> products) {
        super(products);

    }

    @Override
    public Product getProduct(String name, int temperature, float volume) {
        HotDrink tmp = new HotDrink();
        for (Product item : products) {
            if (item.getClass() == tmp.getClass()) {
                HotDrink hd = (HotDrink) item;
                if (hd.getName().equals(name) && 
                    hd.getTemperature() == temperature && 
                    hd.getVolume() == volume) {
                    Product result = item;
                    products.remove(item);
                    return result;
            }
            }
            
        }
        System.out.println("Нет такого продукта: " + name);
        return null;
    }

    
}
