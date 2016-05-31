/**
 *
 * @author andrew
 */
import java.util.HashMap;

public class PromissoryNote {
    
    private HashMap<String, Double> promNote;

    public PromissoryNote() {
        this.promNote = new HashMap<String, Double>();
    }
    
    public void setLoan(String toWhom, double value) {
        this.promNote.put(toWhom, value);
    }
    
    public double howMuchIsTheDebt(String whose) {
        if(this.promNote.containsKey(whose)) {
            return this.promNote.get(whose);
        }
        return 0;
    }
}
