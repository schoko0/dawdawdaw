package Übungen.MockitoÜbungen;


public class FizzBuzz {
    private static final int FIVE = 5;
    private static final int THREE = 3;

    public String calculate(int number) {

        if (isDivisibleBy(number, THREE) && isDivisibleBy(number, FIVE)) {
            return "FizzBuzz";
        }

        if (isDivisibleBy(number, THREE)) {
            return "Fizz";
        }

        if (isDivisibleBy(number, FIVE)) {
            return "Buzz";
        }
        return "" + number;
    }

    private boolean isDivisibleBy(int dividend, int divisor) {
        return dividend % divisor == 0;
    }

}
