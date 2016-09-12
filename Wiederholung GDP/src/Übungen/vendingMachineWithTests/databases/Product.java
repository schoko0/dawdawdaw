package Übungen.vendingMachineWithTests.databases;

public enum Product {
    CANDY("CANDY", 50, 50),
    SNACK("SNACK", 90,45),
    NUTS("NUTS", 120,40),
    COCACOLA("COCA COLA", 110, 30),
    PEPSI("PEPSI", 150, 2),
    SODA("SODA", 110, 40);

    public final String name;
    public final int price;
    public final int stock;

    Product(String name, int price, int stock){
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
}
