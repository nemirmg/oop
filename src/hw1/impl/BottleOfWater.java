package hw1.impl;

import java.time.LocalDate;

import hw1.Product;

public class BottleOfWater extends Product {
    private float volume;
    private String pack;
    private boolean isSpark;

    public BottleOfWater(String name, double price, LocalDate releaseDate) {
        super(name, price, releaseDate);
        this.volume = 1F;
        this.isSpark = false;
        this.pack = Package.PLASTIC.getMaterial();
    }

    public BottleOfWater(String name, double price, LocalDate releaseDate, float volume, String pack, boolean isSpark) {
        super(name, price, releaseDate);
        this.volume = volume;
        this.isSpark = isSpark;
        this.pack = pack;
    }

    public float getVolume() {
        return volume;
    }

    public String getPack() {
        return pack;
    }

    public boolean isSpark() {
        return isSpark;
    }

    @Override
    public String toString() {
        return "BottleOfWater [name='" + name + "', price=" + price + ", releaseDate=" + releaseDate + ", volume=" + volume + ", pack=" + pack + ", isSpark=" + isSpark + "]";
    }

    
}
