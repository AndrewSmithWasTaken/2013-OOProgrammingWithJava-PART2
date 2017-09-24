package tools;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author root
 */
public class PersonalDuplicateRemover implements DuplicateRemover {
    
    private Set<String> uniq;
    private int count;

    public PersonalDuplicateRemover() {
        this.uniq = new HashSet<String>();
        this.count = 0;
    }

    @Override
    public void add(String characterString) {
        if (!uniq.contains(characterString)) {
            uniq.add(characterString);
        }
        else {
            count++;
        }
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return count;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return uniq;
    }

    @Override
    public void empty() {
        uniq.clear();
        count = 0;
    }
}