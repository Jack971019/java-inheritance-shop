package org.lessons.java.shop;

public class Televisions extends Product{

    private String dimension;
    private String smart;

    public Televisions(String name, String brand, double price, double iva, String dimension, String smart) {
        super (name,brand,price,iva);
        dimension = this.dimension;
        smart = this.smart;
    }

    @Override
    public String toString() {
        return "Televisions{" +
                "dimension='" + dimension + '\'' +
                ", smart='" + smart + '\'' +
                ", code=" + code +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", iva=" + iva +
                '}';
    }
}
