package dictionary;

import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author root
 */
public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {
    
    private Map<String, Set<String>> dict;

    public PersonalMultipleEntryDictionary() {
        this.dict = new HashMap<String, Set<String>>();
    }

    @Override
    public void add(String word, String entry) {
        if (!dict.containsKey(word)) {
            dict.put(word, new HashSet<String>());
            dict.get(word).add(entry);
        }
        else {
            dict.get(word).add(entry);
        }
    }

    @Override
    public Set<String> translate(String word) {
        return dict.get(word);
    }

    @Override
    public void remove(String word) {
        dict.remove(word);
    }
}
