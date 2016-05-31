/**
 *
 * @author andrew
 */
import java.util.Comparator;

public class SortAgainstSuitAndValue implements Comparator<Card>{
    
    @Override
    public int compare(Card c1, Card c2) {
        if(c1.getSuit() == c2.getSuit()) {
            return c1.getValue() - c2.getValue();
        } else {
            return c1.getSuit()-c2.getSuit();
        }
    }
}
