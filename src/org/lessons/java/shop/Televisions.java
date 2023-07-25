package org.lessons.java.shop;

public class Televisions extends Product{

    String IMEIcode;
    int capacity;

    public Televisions(String name, String brand, double price, double iva) {
        super (name,brand,price,iva);
        IMEIcode = this.IMEIcode;
        capacity = this.capacity;
    }

}
