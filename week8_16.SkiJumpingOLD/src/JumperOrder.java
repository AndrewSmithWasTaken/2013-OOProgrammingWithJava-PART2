/**
 *
 * @author andrew
 */
import java.util.Comparator;

public class JumperOrder implements Comparator<Skier>{
    
    @Override
    public int compare(Skier s1, Skier s2) {
        return s1.getGrandTotal() - s2.getGrandTotal();
    }
}