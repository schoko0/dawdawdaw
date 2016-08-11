package Übungen.vendingMachineWithTests.Collection;


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

//    public static void main(String[] args) {
//        for(Money p : Money.values()){
//            System.out.println("Name: " + p + "   Wert: " + p.value);
//        }
//    }
//    int calculateRest(int price, int paidMoney){
//        if(paidMoney >= price)
//            return 0;
//        return price - paidMoney;
//    }
}

