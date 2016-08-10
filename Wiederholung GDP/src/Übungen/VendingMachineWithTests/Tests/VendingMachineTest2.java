package Übungen.VendingMachineWithTests.Tests;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import Übungen.VendingMachineWithTests.Operations;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class VendingMachineTest2 {

    private int costs;
    private int paid;
    private int change;

    public VendingMachineTest2(int costs, int paid, int change){
        this.costs = costs;
        this.paid = paid;
        this.change = change;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data2() {
        return Arrays.asList(new Object[][] {
                { 110, 150, 40}, {150, 150, 0}, {150, 10, -2}, {-150, 150, -1}, {-150, -150, -1}, {150, -150, -1},
                {0, 0, 0}, {0, 150, 150}, {150, 0, -2}, {-150, 0, -1}, {0, -150, -1}, {Integer.MAX_VALUE, 150, -3}
        });
    }
    Operations operations = new Operations();

    @Test
    public void changeTest(){
        assertEquals(change, operations.change(costs,paid));
    }


}
