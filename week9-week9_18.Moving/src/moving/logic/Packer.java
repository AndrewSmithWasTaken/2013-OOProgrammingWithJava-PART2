package moving.logic;

/**
 *
 * @author andrew
 */
import java.util.ArrayList;
import java.util.List;
import moving.domain.Thing;
import moving.domain.Box;

public class Packer {
    private int boxesVolume;

    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
    }
    
    public List<Box> packThings(List<Thing> things) {
        List<Box> boxes = new ArrayList<Box>();
        
        for (Thing t : things) {
            Box ml = new Box(boxesVolume);
            ml.addThing(t);
            boxes.add(ml);
        }
 
        return boxes;
//        boxes.add(new Box(this.boxesVolume));
//        for (Thing t : things) {
//            if (!boxes.get(boxes.size()-1).addThing(t)) {
//                boxes.add(new Box(this.boxesVolume));
//                boxes.get(boxes.size()-1).addThing(t);
//            }
//        }
//        return boxes;
    }
}
