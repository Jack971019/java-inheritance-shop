package org.lessons.java.shop;

public class Smartphone extends Product{

    String IMEIcode;
    int capacity;

    public Smartphone(String name, String brand, double price, double iva, int IMEIcode, int capacity) {
        super (name,brand,price,iva);
        this.IMEIcode = String.valueOf(IMEIcode);
        capacity = this.capacity;
    }



}
