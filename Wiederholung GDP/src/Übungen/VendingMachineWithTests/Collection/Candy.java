package Übungen.VendingMachineWithTests.Collection;


public class Candy {

    private String name = "CANDY";
    private int price = 110;
    private int stock;

    public Candy (int stock){
        this.stock = stock;
    }
    public Candy(){};

    public String getName() {return name;}

    public int getStock() {return stock;}

//    public void setStock(int stock) {this.stock = stock;}

    public int getPrice() {return price;}


}
