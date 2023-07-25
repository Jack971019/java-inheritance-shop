package org.lessons.java.shop;

public class Headphones extends Product{

    String color;
    String wirless ;

    public Headphones(String name, String brand, double price, double iva, String color, String wirless ) {
        super (name,brand,price,iva);
        color = this.color;
        wirless = this.wirless;
    }

}
