package moving.domain;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author andrew
 */
public class Box implements Thing {
    private int maximumCapacity;
    private List<Thing> contents;
    
    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        contents = new ArrayList<Thing>();
    }
    
    public boolean addThing(Thing thing) {
//        int total = 0;
//        for (Thing t : contents) {
//            total += t.getVolume();
//        }
//        if (total + thing.getVolume() > maximumCapacity) {
//            return false;
//        }
        if (getVolume() + thing.getVolume() > this.maximumCapacity) {
            return false;
        }
        contents.add(thing);
        return true;
    }
    
    @Override
    public int getVolume() {
        int total = 0;
        for (Thing t : contents) {
            total += t.getVolume();
        }
        return total;
    }
}

