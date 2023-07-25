package org.lessons.java.shop;

public class Smartphone extends Product{

    String IMEIcode;
    int capacity;

    public Smartphone(String name, String brand, double price, double iva) {
        super (name,brand,price,iva);
        IMEIcode = this.IMEIcode;
        capacity = this.capacity;
    }



}
