package Übungen.DiesDas;

/**
 * Created by sniendorf on 26.08.2016.
 */
public class Medium {

        public String title;
        public Medium(String title) { this.title = title; }
        public String getTitle() { return title; }

    public void println() {
        System.out.println("Mediumtitel: " + title);
    }
}
