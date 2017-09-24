/**
 *
 * @author andrew
 */
import java.util.Scanner;
import java.io.File;

public class Printer {
    private File file;
    private Scanner reader;

    public Printer(String fileName) throws Exception {
        this.file = new File(fileName);
    }

    public void printLinesWhichContain(String word) throws Exception {
        this.reader = new Scanner(file);
        String line = "";
        while (reader.hasNextLine()) {
            line = reader.nextLine();
            if (line.contains(word)) {
                System.out.println(line);
            }
        }
        reader.close();
    }
}

//Create the class Printer, its constructor public Printer(String fileName) which 
//receives a String standing for the file name, and the method public void 
//printLinesWhichContain(String word) which prints the file lines which contain 
//the parameter word (lower and upper case make difference in this excercise; for 
//instance, "test" and "Test" are not the considered the same); the lines are 
//printed in the same order as they are inside the file.
//
//If the argument is an empty String, all of the file is printed.
//
//If the file is not found, the constructor delegates the exception with no need 
//for a try-catch statement; the constructor simply has to be defined in the 
//following way: