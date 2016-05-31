/**
 *
 * @author andrew
 */
import java.util.ArrayList;

public class Box implements ToBeStored {
    private double maxWeight;
    private ArrayList<ToBeStored> things = new ArrayList<ToBeStored>();
    
    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
    }
    
    public void add(ToBeStored thing) {
        double newWeight = this.weight() + thing.weight();
        if (!(newWeight > maxWeight)) {
            this.things.add(thing);
        }
    }
    
    public double weight() {
        double newWeight = 0;
        for (ToBeStored th : things) {
            newWeight += th.weight();
        }
        return newWeight;
    }

    @Override
    public String toString() {
        return "Box: "+things.size()+" things, total weight "+this.weight()+" kg";
    }
}
