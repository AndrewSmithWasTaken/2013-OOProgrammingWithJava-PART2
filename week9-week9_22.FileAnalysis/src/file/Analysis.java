package file;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author andrew
 */
public class Analysis {
    private File file;
    //private Scanner reader;
    
    public Analysis(File file) throws Exception {
        this.file = file;
    }
    
    public int lines() throws Exception {
        Scanner reader = new Scanner(file);
        int lines = 0;
        String l;
        while (reader.hasNextLine()) {
            l = reader.nextLine();
            lines++;
        }
        reader.close();
        return lines;
    }
    
    public int characters() throws Exception {
        Scanner reader = new Scanner(file);
        reader.useDelimiter("");
        int chars = 0;
        String c;
        while (reader.hasNext()) {
            c = reader.next();
            chars++;
        }
        reader.close();
        return chars;
    }
}