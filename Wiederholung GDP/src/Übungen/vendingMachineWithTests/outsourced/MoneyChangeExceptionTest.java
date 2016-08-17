package Übungen.vendingMachineWithTests.outsourced;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by sniendorf on 17.08.2016.
 */
public class MoneyChangeExceptionTest {

    private int costs;
    private int paid;
    private int change;

    public MoneyChangeExceptionTest(int costs, int paid, int change){
        this.costs = costs;
        this.paid = paid;
        this.change = change;
    }


    @Parameterized.Parameters
    public static Collection<Object[]> data3() {
        return Arrays.asList(new Object[][] {
                {-150, 150, -1}, {-150, -150, -1}, {-150, 0, -1}, {0, -150, -1}, {Integer.MAX_VALUE, 150, -3}, {150, -150, -1}
        });
    }
    moneyOperations operations2 = new moneyOperations();

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test
    public void changeTestException(){
        exception.expect(IllegalArgumentException.class);
        operations2.change(costs, paid);
    }
}
