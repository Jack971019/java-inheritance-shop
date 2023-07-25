package org.lessons.java.shop;

import java.util.ArrayList;
import java.util.Scanner;

public class Cart {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList <Product> cart = new ArrayList<>();

        boolean quit = false;

        while (!quit) {

            System.out.println("Digit '1' for Smartphone, Digit '2' for Televisions, Digit '3' for Headphones" +
                " , otherwise Digit 'stop' to stop shopping");
            String userChoice = scan.nextLine();

            System.out.println("name:");
            String userName= scan.nextLine();
            System.out.println("brand:");
            String userBrand= scan.nextLine();
            System.out.println("price:");
            int userPrice= Integer.parseInt(scan.nextLine());
            System.out.println("iva:");
            int userIva= Integer.parseInt(scan.nextLine());




            switch (userChoice) {

                case "1":
                    System.out.println("Code IMEI");
                    int userIMEI = Integer.parseInt(scan.nextLine());
                    System.out.println("Capacity");
                    int userCapacity = Integer.parseInt(scan.nextLine());
                    Smartphone smartphone = new Smartphone (userName, userBrand, userPrice, userIva, userIMEI, userCapacity);
                    cart.add(smartphone);

                    break;
                case "2":
                    System.out.println("Dimension");
                    String userDimension = scan.nextLine();
                    System.out.println("smart / not smart");
                    String userSmart = scan.nextLine();
                    Televisions television = new Televisions(userName, userBrand, userPrice, userIva, userDimension, userSmart);
                    cart.add(television);
                    break;
                case "3":
                    System.out.println("Color");
                    String userColor = scan.nextLine();
                    System.out.println("Wirless / Cable");
                    String userCable = scan.nextLine();
                    Headphones headphones = new Headphones(userName, userBrand, userPrice, userIva, userColor, userCable);
                    cart.add(headphones);
                    break;

                    default:
                    System.out.println("choice not available");
                    break;
            }

            System.out.println("do you want to add more items to the cart?");
            String answer = scan.nextLine();

            if(answer.equalsIgnoreCase("NO")){
                quit = true;
                break;
            }



        }

        System.out.println(" il tuo carrello ha:" + cart);

        scan.close();

    }


}