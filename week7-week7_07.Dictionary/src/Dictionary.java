/**
 *
 * @author andrew
 */

import java.util.HashMap;
import java.util.ArrayList;

public class Dictionary {
    
    private HashMap<String, String> dictionary;

    public Dictionary() {
        this.dictionary = new HashMap<String, String>();
    }
    
    public String translate(String word) {
        return this.dictionary.get(word);
    }
    
    public void add(String word, String translation) {
        this.dictionary.put(word, translation);
    }
    
    public int amountOfWords() {
        return this.dictionary.size();
    }
    
    public ArrayList<String> translationList() {
        ArrayList<String> keys = new ArrayList<String>(dictionary.keySet());
        ArrayList<String> values = new ArrayList<String>(dictionary.values());
        ArrayList<String> transList = new ArrayList<String>();
        String str = "";
        for (int i = 0; i < values.size(); i++) {
            str = keys.get(i) + " = " + values.get(i);
            transList.add(str);
        }
        return transList;
    }
}
