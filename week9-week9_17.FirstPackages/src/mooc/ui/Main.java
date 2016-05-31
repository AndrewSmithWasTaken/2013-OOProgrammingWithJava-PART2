package mooc.ui;

//import mooc.logic.ApplicationLogic;
//import mooc.ui.UserInterface;
//import mooc.ui.TextUserInterface;

public class Main {

    public static void main(String[] args) {
        UserInterface ui = new TextUserInterface();
        new mooc.logic.ApplicationLogic(ui).execute(3);
    }
}
