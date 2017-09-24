/**
 *
 * @author root
 */
import java.util.Scanner;

public class phoneUI {
    
    private Scanner reader;

    public phoneUI(Scanner reader) {
        this.reader = new Scanner(System.in);
    }
    
    public void start() {
        phoneManager();
    }
    
    public void phoneManager() {
        System.out.println("phone search\n"
                +"available operations:\n"
                +" 1 add a number\n"
                +" 2 search for a number\n"
                +" 3 search for a person by phone number\n"
                +" 4 add an address\n"
                +" 5 search for personal information\n"
                +" 6 delete personal information\n"
                +" 7 filtered listing\n"
                +" x quit\n\n"
                
    }
    
}
