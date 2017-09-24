package wordinspection;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
/**
 *
 * @author andrew
 */
public class WordInspection {
    private File file;
    
    public WordInspection(File file) throws Exception {
        this.file = file;
    }
    
    public int wordCount() throws Exception {
        Scanner reader = new Scanner(file);
        String word;
        int words = 0;
        while (reader.hasNextLine()) {
            word = reader.nextLine();
            words++;
        }
        reader.close();
        return words;
    }
    
    public List<String> wordsContainingZ() throws Exception {
        Scanner reader = new Scanner(file);
        List<String> zWords = new ArrayList<String>();
        String w;
        while (reader.hasNext()) {
            w = reader.next();
            if (w.contains("z")) {
                zWords.add(w);
            }
        }
        reader.close();
        return zWords;
    }
    
    public List<String> wordsEndingInL() throws Exception {
        Scanner reader = new Scanner(file);
        List<String> lWords = new ArrayList<String>();
        String w;
        while (reader.hasNext()) {
            w = reader.next();
            if (w.endsWith("l")) {
                lWords.add(w);
            }
        }
        reader.close();
        return lWords;
    }
    
    public List<String> palindromes() throws Exception {
        Scanner reader = new Scanner(file);
        List<String> pWords = new ArrayList<String>();
        String w;
        while (reader.hasNext()) {
            w = reader.next();
            String p = "";
            for (int i = w.length()-1; i >= 0; i--) {
                p += w.charAt(i);
            }
            if (w.equals(p)) {
                pWords.add(w);
            }
        }
        reader.close();
        return pWords;
    }
    
    public List<String> wordsWhichContainAllVowels() throws Exception {
        Scanner reader = new Scanner(file);
        List<String> vWords = new ArrayList<String>();
        String v;
        while (reader.hasNext()) {
            v = reader.next();
            if (v.contains("a") && v.contains("e") && v.contains("i") && 
                v.contains("o") && v.contains("u") && v.contains("ä") && 
                v.contains("y") && 
                v.contains("ö")) {
                vWords.add(v);
            }
        }
        reader.close();
        return vWords;
    }   
}