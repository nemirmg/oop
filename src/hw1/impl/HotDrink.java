package hw1.impl;

import java.time.LocalDate;

import hw1.Product;

public class HotDrink extends Product {
    private int temperature;
    private float volume;

    public HotDrink() {
        super();
    }
    
    public HotDrink(String name, double price, LocalDate releaseDate) {
        super(name, price, releaseDate);
        this.temperature = 90;
        this.volume = 0.2F;
    }

    public HotDrink(String name, double price, LocalDate releaseDate, 
                    int temperature, float volume) {
        super(name, price, releaseDate);
        this.temperature = temperature;
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public float getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "HotDrink {name='" + name + "', price=" + price + 
                          ", releaseDate=" + releaseDate + 
                          ", temperature=" + temperature + 
                          ", volume=" + volume + "}";
    }

    
}
