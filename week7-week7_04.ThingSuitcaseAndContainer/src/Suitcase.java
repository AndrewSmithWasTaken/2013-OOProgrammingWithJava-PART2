/**
 *
 * @author andrew
 */
import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Thing> things;
    private int maxWeight;
    private int totalWeight;

    public Suitcase(int maxWeight) {
        this.things = new ArrayList<Thing>();
        this.maxWeight = maxWeight;
    }
    
    public void addThing(Thing thing) {
        int totw = totalWeight();
        int getw = thing.getWeight();
        if (getw + totw <= maxWeight) {
            this.things.add(thing);
            totalWeight += getw;
        }
    }
    
    public int totalWeight() {
        totalWeight = 0;
        for (Thing t : things) {
            totalWeight +=t.getWeight();
        }
        return totalWeight;
    }
    
    public Thing heaviestThing() {
        if (things.isEmpty()) {
            return null;
        }
        int heaviest = 0;
        int ix = 0;
        for (Thing t : things) {
            int getw = t.getWeight();
            if (getw > heaviest) {
                heaviest = getw;
                ix = things.indexOf(t);
            }
        }
        return things.get(ix);
    }
    
    public void printThings() {
        System.out.println("Your suitcase contains the following things:");
        for (Thing t : things) {
            System.out.println(t.getName() + "( " + t.getWeight() + " kg)");
        }
        System.out.println("Total weight: " + totalWeight + " kg");
    }
    
    @Override
    public String toString() {
        if (things.size() == 0) {
            return "empty (" + totalWeight + " kg)";
        }
        if (things.size() == 1) {
            return Integer.toString(things.size()) + " thing (" + totalWeight + " kg)";
        }
        else {
            return Integer.toString(things.size()) + " things (" + totalWeight + " kg)";
        } 
    }
}
