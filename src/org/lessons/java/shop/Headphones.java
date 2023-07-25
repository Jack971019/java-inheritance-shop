package org.lessons.java.shop;

public class Headphones extends Product{

    private String color;
    private String wirless ;

    public Headphones(String name, String brand, double price, double iva, String color, String wirless ) {
        super (name,brand,price,iva);
        color = this.color;
        wirless = this.wirless;
    }

    @Override
    public String toString() {
        return "Headphones{" +
                "color='" + color + '\'' +
                ", wirless='" + wirless + '\'' +
                ", code=" + code +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", iva=" + iva +
                '}';
    }
}
