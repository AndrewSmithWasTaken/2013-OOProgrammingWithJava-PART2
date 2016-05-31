
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
//        Scanner reader = new Scanner(System.in);
//        Dictionary dict = new Dictionary();
//
//        TextUserInterface ui = new TextUserInterface(reader, dict);
//        ui.start();

        String input = "add\n"  + "cheese\n" + "juusto\n" +
                   "add\n"  + "bier\n" + "olut\n" +
                   "add\n"  + "book\n" + "kirja\n" +
                   "add\n"  + "computer\n" + "tietokone\n" +
                   "add\n"  + "auto\n" + "car\n" +
                   "quit\n";

        Scanner reader = new Scanner(input);
        Dictionary dictionary = new Dictionary();

        TextUserInterface ui = new TextUserInterface(reader, dictionary);
        ui.start();
    }
}
