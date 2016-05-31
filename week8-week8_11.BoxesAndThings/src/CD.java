/**
 *
 * @author andrew
 */
public class CD implements ToBeStored {
    
    String artist;
    String title;
    int publishingYear;
    double weight;

    public CD(String artist, String title, int publishingYear) {
        this.artist = artist;
        this.title = title;
        this.publishingYear = publishingYear;
        this.weight = 0.1;
    }
    
    public double weight() {
        return this.weight;
    }
    
    @Override
    public String toString() {
        return this.artist+": "+this.title+" ("+this.publishingYear+")";
    }
}
