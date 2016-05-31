/**
 *
 * @author andrew
 */
import java.util.HashMap;

public class Skier implements Comparable<Skier>{
    private int grandTotal;
    private String name;
    private String judge;
    private HashMap<Integer, Result> results;
    private int roundNum;
    private int lastT;

    public Skier(String name) {
        this.name = name;
        this.results = new HashMap<Integer, Result>();
        this.grandTotal = 0;
        this.roundNum = 1;
        this.judge = "";
        this.lastT = 0;
    }
    
    public void setLastT(int i) {
        this.lastT = i;
    }
    
    public int getLastT() {
        return lastT;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public String getJ() {
        return judge;
    }

    public int getGrandTotal() {
        return grandTotal;
    }
    
    public void jump() {
        Result res = new Result();
        res.setJudgeScores();
        judge = res.getJudgeScores();
        res.trimScoresAndAddDist();
        results.put(roundNum, res);
        this.grandTotal += res.getRoundTotal();
        roundNum++;
    }

    public void printSkierAndPoints() {
        System.out.println(
               this.getName()
               +" ("+this.getGrandTotal()+" points)");
    }

    @Override
    public int compareTo(Skier s) {
        return this.getGrandTotal() - s.getGrandTotal();
    }
}
