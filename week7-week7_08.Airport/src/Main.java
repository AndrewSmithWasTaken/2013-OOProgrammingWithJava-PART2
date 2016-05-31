import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        AirportManager airportUI = new AirportManager(reader);

        airportUI.start();
    }
}
