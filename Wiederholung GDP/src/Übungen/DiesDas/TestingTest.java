package Übungen.DiesDas;


import org.junit.Assert;
import org.junit.Test;

public class TestingTest {

//    @Test
//    public void testttttttt() {
//        double expected = 2.55;
//        double actual = 2.5;
//        double actual2 = 2.6;
//
//        Assert.assertEquals(expected, actual, 0.05);
//        Assert.assertEquals(expected, actual2, 0.05);
//
//    }

    public static void main(String[] args) {

        Medium m = new Medium("Medium-Titel");
        Book b = new Book("Buch-Titel", 127);
        m.println();
        b.println();

        Medium[] medien = new Medium[2];
        medien[0] = new Medium("Medium-Titel");
        medien[1] = new Book("Buch-Titel", 127);

        // for (int i=0; i < medien.length; i++) {
        // medien[i].println();
        // }
        for (Medium medium : medien) {
            medium.println();
        }
    }
}
