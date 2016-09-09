package Übungen.vendingMachineWithTests.databases;


public enum Money {
    TWO_EUROS(200),
    ONE_EURO(100),
    FIFTY_CENTS(50),
    TWENTY_CENTS(20),
    TEN_CENTS(10);

    public int value;

    Money(int value){
        this.value = value;
    }
}

