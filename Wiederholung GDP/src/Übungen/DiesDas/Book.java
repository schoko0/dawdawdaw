package Übungen.DiesDas;

/**
 * Created by sniendorf on 26.08.2016.
 */
public class Book extends Medium{
    public int pages;
    public Book (String title,
                 int pages) {
        super(title);
        this.pages = pages;
    }
    public int getPages() {
        return pages;
    }
    @Override
    public void println() {
        System.out.println("Buchtitel: " + title);
        System.out.println("\tSeitenzahl: " + pages);
    }
}
