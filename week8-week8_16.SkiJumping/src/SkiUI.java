/**
 *
 * @author andrew
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SkiUI {
    private Scanner reader;
    private ArrayList<Skier> skiers;
    private int roundNum;
    
    public SkiUI(Scanner reader) {
        this.reader = reader;
        this.skiers = new ArrayList<Skier>();
        roundNum = 1;
    }
    
    public void start() {
        addCompetitors();
        runCompetition();
        printResults();
    }
    
    public void addCompetitors() {
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
    
    public void runCompetition() {
        System.out.print("\nThe tournament begins!\n\n");
        System.out.println("Write \"jump\" to jump; otherwise you quit: ");
        
        while (true) {
            String command = reader.nextLine();
            
            if (command.equals("jump")) {
                System.out.print("\nRound "+roundNum+"\n\n"
                        +"Jumping order:\n");
                for (Skier s : skiers) {
                    System.out.println("   "+(skiers.indexOf(s)+1)+". "
                            +s.getName()+" ("+s.getGrandTotal()+" points)");
                }
                System.out.println();
                System.out.println("Results of round "+roundNum+"");
                for (Skier s : skiers) {
                    s.jump();
                }
                Collections.sort(skiers);
                for (Skier s : skiers) {
                    System.out.print("   length: "+s.getLastT()+"\n"
                            +"   judge votes: "+s.getJ());
                }
                roundNum++;
                System.out.print("\n\nWrite \"jump\" to jump; otherwise you quit: ");
            }
            else {
                System.out.print("\n\nThanks!\n\n");
                break;
            }
        }
    }
    
    public void printResults() {
    }
}