/**
 *
 * @author andrew
 */
import java.util.ArrayList;
import java.util.List;

public class Skier {
    private String name;
    private int runningTotal;
    private int grandTotal;
    private List<Integer> allThrows;

    public Skier(String name) {
        this.name = name;
        this.runningTotal = 0;
        this.allThrows = new ArrayList<Integer>();
    }

    public String getName() {
        return name;
    }
    
    public int getRunningTotal() {
        return runningTotal;
    }
    
    public void setRunningTotal(int points) {
        this.runningTotal = points;
    }

    public int getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(int grandTotal) {
        this.grandTotal = grandTotal;
    }
    
    public void storeThrows(int lastThrow) {
        allThrows.add(lastThrow);
    }
    
    public void getAllThrows() {
        System.out.print(allThrows.get(0)+" m");
        for (int i = 1; i < allThrows.size(); i++) {
            System.out.println(", "+allThrows.get(i)+" m");
            System.out.println("");
        }
    }
}