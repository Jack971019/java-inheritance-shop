package org.lessons.java.shop;

public class Headphones extends Product{

    String IMEIcode;
    int capacity;

    public Headphones(String name, String brand, double price, double iva) {
        super (name,brand,price,iva);
        IMEIcode = this.IMEIcode;
        capacity = this.capacity;
    }

}
