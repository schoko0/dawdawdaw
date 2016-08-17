package Übungen.vendingMachineWithTests.databases;


public enum Money {
    ONE_EURO(100),
    TWO_EUROS(200),
    TEN_CENTS(10),
    TWENTY_CENTS(20),
    FIFTHY_CENTS(50);

    public int value;

    Money(int value){
        this.value = value;
    }


}

