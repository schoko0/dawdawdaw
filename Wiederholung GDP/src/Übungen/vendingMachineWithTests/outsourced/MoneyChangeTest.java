package Übungen.vendingMachineWithTests.outsourced;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import Übungen.vendingMachineWithTests.outsourced.moneyOperations;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class MoneyChangeTest {

    private int costs;
    private int paid;
    private int change;

    public MoneyChangeTest(int costs, int paid, int change){
        this.costs = costs;
        this.paid = paid;
        this.change = change;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data2() {
        return Arrays.asList(new Object[][] {
                { 110, 150, 40}, {150, 150, 0}, {0, 0, 0}, {0, 150, 150}
        });
    }
    moneyOperations operations = new moneyOperations();

    @Test
    public void changeTest(){
        assertEquals(change, operations.change(costs,paid));
    }



}
// {150, 10, -2},
//,{150, 0, -2}