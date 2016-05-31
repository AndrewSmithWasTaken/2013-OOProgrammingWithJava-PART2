/**
 *
 * @author andrew
 */
import java.util.Scanner;

public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;
    
    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }
    
    public void start() {
        System.out.println("Statements:");
        System.out.println("\tadd - adds a word pair to the dictionary");
        System.out.println("\ttranslate - asks a word and prints its translation");
        System.out.println("\tquit - quits the text user interface");
        while (true) {
            String command = reader.nextLine();
            command = stringClean(command);
            if (command.equals("quit")) {
                System.out.println("Cheers!");
                break;
            } 
            else if (command.equals("add")) {
                add();
            }
            else if (command.equals("translate")) {
                translate();
            }
            else {
                System.out.println("Unknown statement");
            }
        }
    }
    
    private String stringClean(String string) {
        if (string == null) {
            return "";
        }

        string = string.toLowerCase();
        return string.trim();
    }
    
    private void add() {
        System.out.println("In Finnish: ");
        String fin = reader.nextLine();
        System.out.println("Translation: ");
        String eng = reader.nextLine();
        dictionary.add(fin, eng);
    }
    
    private void translate() {
        System.out.println("Give a word: ");
        String fin = reader.nextLine();
        String eng = dictionary.translate(fin);
        System.out.println("Translation: " + eng);
    }
    
}
