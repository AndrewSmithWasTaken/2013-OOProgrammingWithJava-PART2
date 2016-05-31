import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        SkiSimulator sim = new SkiSimulator(reader);
        sim.start();
    }
}