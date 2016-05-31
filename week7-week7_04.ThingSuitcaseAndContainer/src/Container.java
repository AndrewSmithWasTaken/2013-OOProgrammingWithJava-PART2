/**
 *
 * @author andrew
 */

import java.util.ArrayList;

public class Container {
    
    private int maxWeight;
    private ArrayList<Suitcase> container;
    private int totWeight;

    public Container(int maxWeight) {
        this.container = new ArrayList<Suitcase>();
        this.maxWeight = maxWeight;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        int totw = suitcase.totalWeight();
        if (totw + totWeight <= maxWeight) {
            this.container.add(suitcase);
            totWeight += totw;
        }
    }
    
    public void printThings() {
        for (Suitcase s : container) {
            s.printThings();
        }
    }
    
    @Override
    public String toString() {
        if (container.isEmpty()) {
            return "empty (" + totWeight + " kg)";
        }
        if (container.size() == 1) {
            return Integer.toString(container.size()) + " suitcase (" + totWeight + " kg)";
        }
        else {
            return Integer.toString(container.size()) + " suitcases (" + totWeight + " kg)";
        } 
    }
}