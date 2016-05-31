package mooc.logic;

/**
 *
 * @author andrew
 */
//import mooc.ui.UserInterface;

public class ApplicationLogic {
    private mooc.ui.UserInterface ui;
    
    public ApplicationLogic(mooc.ui.UserInterface ui) {
        this.ui = ui;
    }
    
    public void execute(int howManyTimes) {
        for (int i = 0; i < howManyTimes; i++) {
            System.out.println("The application logic works");
            ui.update();
        }
    }
}