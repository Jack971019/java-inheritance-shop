package org.lessons.java.shop;

public class Televisions extends Product{

    String dimension;
    String smart;

    public Televisions(String name, String brand, double price, double iva, String dimension, String smart) {
        super (name,brand,price,iva);
        dimension = this.dimension;
        smart = this.smart;
    }

}
