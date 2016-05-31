/**
 *
 * @author andrew
 */
import java.util.Scanner;
import java.util.ArrayList;

public class AirportManager {
    
    private Scanner reader;
    private ArrayList<Plane> planes;
    private ArrayList<Flight> flights;

    public AirportManager(Scanner reader) {
        this.reader = reader;
        this.planes = new ArrayList<Plane>();
        this.flights = new ArrayList<Flight>();
    }
    
    public void start() {
        airportPanel();
        flightService();
    }
    
    public void airportPanel() {
        System.out.print("Airport panel\n"
                + "--------------------\n\n");
        
        while (true) {
            System.out.println("Choose operation:\n"
                    + "[1] Add airplane\n"
                    + "[2] Add flight\n"
                    + "[x] Exit\n"
                    + "> ");
            
            String in = reader.nextLine();
            
            if (in.equals("1")) {
                addPlane();
            }
            if (in.equals("2")) {
                addFlight();
            } 
            else if (in.equals("x")) { 
                break;
            }
        }
    }
    
    public void addPlane() {
        System.out.println("Give plane ID: ");
        String id = reader.nextLine();
        
        System.out.println("Give plane capacity: ");
        int cap = Integer.parseInt(reader.nextLine());
        
        this.planes.add(new Plane(id, cap));
    }
    
    public void addFlight() {
        System.out.println("Give plane ID: ");
        String id = reader.nextLine();
        
        System.out.println("Give departure airport code: ");
        String dep = reader.nextLine();
        
        System.out.println("Give destination airport code: ");
        String dest = reader.nextLine();
        
        this.flights.add(new Flight(findPlane(id, planes),dep, dest));
    }
    
    public void flightService() {
        System.out.println("Flight service\n"
                + "------------\n\n");
        
        while (true) {
            System.out.println("Choose operation:\n"
                    + "[1] Print planes\n"
                    + "[2] Print flights\n"
                    + "[3] Print plane info\n"
                    + "[x] Quit\n"
                    + "> ");
            
            String in = reader.nextLine();
            
            if (in.equals("1")) {
                printPlanes();
            }
            else if (in.equals("2")) {
                printFlights();
            } 
            else if (in.equals("3")) {
                printPlaneInfo();
            } 
            else if (in.equals("x")){ 
                break;
            }
        }
    }
    
    public void printPlanes() {
        for (Plane p : planes) {
            System.out.println(p);
        }
    }
    
    public void printFlights() {
        for (Flight f : flights) {
            System.out.println(f);
        }
    }
    
    public void printPlaneInfo() {
        System.out.println("Give plane ID: ");
        String id = reader.nextLine();
        
        for (Plane p : planes) {
            if (id.equals(p.getID())) {
                System.out.println(p);
            }
        }
    }
    
    public Plane findPlane(String ID, ArrayList<Plane> planes) {
        for (Plane p : planes) {
            if (ID.equals(p.getID())) {
                return p;
            }
        }
        return null;
    }
}
