/**
 *
 * @author andrew
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SkiSimulator {
    private Scanner reader;
    private List<Skier> skiers;

    public SkiSimulator(Scanner reader) {
        this.reader = reader;
        this.skiers = new ArrayList<Skier>();
    }
    
    public void start() {
        entryList();
        runCompetition();
        printResults();
    }
    
    public void entryList() {
        System.out.print("Kumpula ski jumping week\n\n"
                + "Write the names of the participants one at a time; an empty "
                + "string brings you to the jumping phase.\n");
        
        while (true) {
            System.out.print("   Participant name: \n");

            String name = reader.nextLine();
            if (name.isEmpty()) {
                break;
            }
            skiers.add(new Skier(name));
        }
    }
    
    public void sortByPoints() {
        JumperOrder sorter = new JumperOrder();
        Collections.sort(skiers, sorter);
    }
    
    public void runCompetition() {
        System.out.print("\nThe tournament begins!\n\n");
        System.out.print("Write \"jump\" to jump; otherwise you quit: ");
        int roundNum = 1;
        
        while (true) {
            
            String command = reader.nextLine();
            
            if (command.equals("jump")) {
                System.out.print("Round "+roundNum+"\n\n"
                        +"Jumping order:\n");
                for (Skier s : skiers) {
                    System.out.println("  "+(skiers.indexOf(s)+1)+". "+s.getName()
                            +" ("+s.getGrandTotal()+" points)");
                }
                System.out.println();
                System.out.println("Results of round "+roundNum+"");
                // JUMPING NOW
                ScoreCalculator scoreCalc = new ScoreCalculator();
                int i = 0;
                for (Skier s : skiers) {
                    s.setGrandTotal(scoreCalc.jump(s));
                }
                sortByPoints();
                for (Skier s : skiers) {
                    System.out.print("  "+s.getName()+"\n"
                            +"     length: "+scoreCalc.getLastThrow()+"\n"
                            +"     judge votes: "+scoreCalc.getLastScores()+"\n");
                }
                roundNum++;
                System.out.print("\n\nWrite \"jump\" to jump; otherwise you quit: ");
            }
            else {
                System.out.print("\nThanks!\n\n");
                break;
            }
        }
    }
    
    public void printResults() {
        System.out.println("Tournament results:");
        System.out.println("Position    Name");
        Collections.reverse(skiers);
        for (Skier s : skiers) {
            System.out.print(skiers.indexOf(s)+1+"           "+s.getName()+" ("+s.getGrandTotal()+" points)\n"+"            jump lengths: ");
            s.getAllThrows();
        }
    }
}
