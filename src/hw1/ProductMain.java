package hw1;

import java.time.LocalDate;
import java.util.List;

import hw1.impl.BottleOfWater;
import hw1.impl.HotDrink;
import hw1.impl.HotDrinkVendingMachine;

public class ProductMain {
    public static void main(String[] args) {
        Product bottle1 = new BottleOfWater("Родники", 55, LocalDate.of(2024, 03, 01));
        // Product bottle2 = new BottleOfWater("Родники Газированная", 55, LocalDate.of(2024, 03, 01), 0.5F, Package.GLASS.getMaterial(), true);
        
        // VendingMachine vm = new WaterVendingMachine();
        // System.out.println(vm.getProducts());

        // vm.addProducts(List.of(bottle1, bottle1, bottle1, bottle2, bottle2, bottle2));
        // System.out.println(vm.getProducts());

        // vm.getProduct("Родники");
        // System.out.println(vm.getProducts());

        Product cofe1 = new HotDrink("Кофе", 100, LocalDate.now(), 90, 0.2F);
        Product cofe2 = new HotDrink("Кофе", 150, LocalDate.now(), 90, 0.4F);
        Product cofe3 = new HotDrink("Кофе с молоком", 100, LocalDate.now(), 90, 0.4F);

        VendingMachine vmHot = new HotDrinkVendingMachine();
        System.out.println(vmHot.getProducts());

        vmHot.addProducts(List.of(bottle1, cofe1, cofe2, cofe3));
        System.out.println(vmHot.getProducts());

        vmHot.getProduct("Кофе", 90, 0.4F);
        System.out.println(vmHot.getProducts());
    }
}
