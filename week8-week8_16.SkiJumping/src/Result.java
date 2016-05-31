/**
 *
 * @author andrew
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Result {
    private int dist = 0;
    private int roundTotal = 0;
    private List<Integer> judgeScores = new ArrayList<Integer>(5);
    private Random rand = new Random();
    private int lastT;

    public int getDist() {
        this.dist = rand.nextInt(61) + 60;
        this.lastT = dist;
        return dist;
    }

    public String getJudgeScores() {
        return judgeScores.toString();
    }

    public void setJudgeScores() {
        for (int i = 0; i < 5; i++) {
            judgeScores.add(rand.nextInt(11) + 10);
        }
    }

    public int getRoundTotal() {
        return roundTotal;
    }

    public void trimScoresAndAddDist() {
        Collections.sort(judgeScores);
        List copy = new ArrayList(judgeScores);
        copy.remove(0);
        copy.remove(3);
        for (Object o : copy) {
            roundTotal += (Integer)o;
        }
        this.roundTotal = roundTotal + getDist();
    }
}