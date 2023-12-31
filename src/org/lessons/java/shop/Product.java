package org.lessons.java.shop;

import java.util.Random;

public class Product {

    // CAMPI

     int code;

     String name;

     String brand;

     double price;



     double iva;

    // COSTRUTTORI

    Random random = new Random();



    public Product(String name, String description, double price, double iva){
        this.code = random.nextInt(0, 99999999) + 1 ;
        this.name=name;
        this.brand= brand;
        this.price= price;
        this.iva=iva;
    }

    // GETTER AND SETTER

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return brand;
    }

    public void setDescription(String description) {
        this.brand = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }



    // METODI


    @Override
    public String toString() {
        return "Product{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", iva=" + iva +
                ", random=" + random +
                '}';
    }

    public double getPricePlusIva(){
        double PricePlusIva = price + (price * iva / 100);
        return PricePlusIva;
    }

    // metodo per concatenare nome e codice




}
