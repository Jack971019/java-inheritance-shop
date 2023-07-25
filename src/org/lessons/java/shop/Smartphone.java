package org.lessons.java.shop;

public class Smartphone extends Product{

    private String IMEIcode;
    private int capacity;

    public Smartphone(String name, String brand, double price, double iva, int IMEIcode, int capacity) {
        super (name,brand,price,iva);
        this.IMEIcode = String.valueOf(IMEIcode);
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "IMEIcode='" + IMEIcode + '\'' +
                ", capacity=" + capacity +
                ", code=" + code +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", iva=" + iva +
                '}';
    }
}
