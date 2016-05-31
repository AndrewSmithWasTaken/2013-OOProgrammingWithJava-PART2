/**
 *
 * @author andrew
 */

public class Flight {
    
    private Plane plane;
    private String dep;
    private String dest;

    public Flight(Plane plane, String dep, String dest) {
        this.plane = plane;
        this.dep = dep;
        this.dest = dest;
    }

    @Override
    public String toString() {
        return plane + " (" + dep + "-" + dest + ")";
    }
}
