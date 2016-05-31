/**
 *
 * @author andrew
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ScoreCalculator {
    private List<Integer> provisionalScores;
    private Random rand = new Random();
    private int numJudges = 5;
    private int lastThrow;
    private String lastScores;
    
    public int jump(Skier s) {
        // First we get five random scores, remove hi/lo and sum
        provisionalScores = new ArrayList<Integer>();
        int runningTotal = 0;
        for (int i = 0; i < numJudges; i++) {
            provisionalScores.add(i, rand.nextInt(11) + 10);
        }
        lastScores = provisionalScores.toString();
        sortAndTrimScores((ArrayList<Integer>) provisionalScores);
        for (Integer i : provisionalScores) {
            runningTotal += i;
        }
        provisionalScores.clear();
        // Now we add the distance score and return
        lastThrow = rand.nextInt(61) + 60;
        s.storeThrows(lastThrow);
        s.setGrandTotal(runningTotal += lastThrow);
        return s.getGrandTotal();
    }
    
    public void sortAndTrimScores(ArrayList<Integer> al) {
        Collections.sort(provisionalScores);
        al.remove(0);
        al.remove(numJudges-2);
    }
    
    public int getLastThrow() {
        return lastThrow;
    }

    public String getLastScores() {
        return lastScores;
    }
}
