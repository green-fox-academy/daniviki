package com.greenfoxacademy.webshop;

import java.util.List;

public class ShopItem implements Comparable <ShopItem> {
    private String name;
    private String description;
    private double price;
    private int quantityOfStock;

    public ShopItem(String name, String description, double price, int quantityOfStock) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantityOfStock = quantityOfStock;
    }


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantityOfStock() {
        return quantityOfStock;
    }

    @Override
    public int compareTo(ShopItem other) {
        if (this.getPrice() > other.getPrice()){
            return 1;
        }else if (this.getPrice() < other.getPrice()) {
            return -1;
        }
        return 0;
    }
}
