package com.programmr.java.inheritance;

import java.util.Scanner;

/**
 * @author Nika Zurbaevi
 */
public class PurchasedItem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:");
        String name1 = scanner.nextLine();
        System.out.println("Enter unit price:");
        double up = scanner.nextDouble();
        System.out.println("Enter weight:");
        double w = scanner.nextDouble();
        WeighedItem item1 = new WeighedItem(name1, up, w);
        scanner.nextLine();
        System.out.println("Enter name:");
        String name2 = scanner.nextLine();
        System.out.println("Enter unit price:");
        double up1 = scanner.nextDouble();
        System.out.println("Enter quantity:");
        int q = scanner.nextInt();
        CountedItem item2 = new CountedItem(name2, up1, q);
        System.out.println(item1);
        System.out.println(item2);
    }
}

abstract class PurchaseItem {

    private String name;
    private double unitPrice;

    public PurchaseItem(String n, double up) {
        name = n;
        setPrice(up);
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public double getPrice() {
        return unitPrice;
    }

    public void setPrice(double up) {
        unitPrice = (up > 0) ? up : 0;
    }

    public abstract String toString();
}

class WeighedItem extends PurchaseItem {

    private double weight;

    public WeighedItem(String name, double weight, double unitPrice) {

        super(name, unitPrice);
        this.weight = weight;

    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;

    }

    @Override
    public String toString() {
        return getName() + "@ " + getPrice() + " " + getWeight() + " kg " + getPrice() * getWeight() + "$";
    }
}

class CountedItem extends PurchaseItem {

    private int quantity;

    public CountedItem(String name, double unitPrice, int quantity) {
        super(name, unitPrice);
        this.quantity = quantity;

    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return getName() + "@ " + getPrice() + " " + getQuantity() + " kg " + getPrice() * getQuantity() + "$";
    }

}
