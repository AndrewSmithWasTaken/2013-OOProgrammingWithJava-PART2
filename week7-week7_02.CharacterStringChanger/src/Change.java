
public class Change {
    char from;
    char to;

    public Change(char fromCharacter, char toCharacter) {
        this.from = fromCharacter;
        this.to = toCharacter;
    }
    
    public String change(String characterString) {
        
        String changed = characterString.replace(from, to);
        return changed;
    }
    
}