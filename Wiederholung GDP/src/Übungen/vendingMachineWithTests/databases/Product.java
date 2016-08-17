package Übungen.vendingMachineWithTests.databases;

/**
 * Created by sniendorf on 16.08.2016.
 */
public enum Product {
    CANDY("CANDY", 50, 50),
    SNACK("SNACK", 90,45),
    NUTS("NUTS", 125,40),
    COCACOLA("COCA COLA", 110, 30),
    PEPSI("PEPSI", 150, 20),
    SODA("SODA", 115, 40);


    public final String name;
    public final int price;
    public final int stock;

    Product(String name, int price, int stock){
        this.name = name;
        this.price = price;
        this.stock = stock;
    }


}
