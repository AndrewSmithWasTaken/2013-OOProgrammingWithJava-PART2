
public class Main {

    public static void main(String[] Container) {
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }

    public static void addSuitcasesFullOfBricks(Container container) {
        int ix = 0;
        while (ix < 100) {
            Thing brick = new Thing("Brick", ix+1);
            Suitcase suitcase = new Suitcase(101);
            suitcase.addThing(brick);
            container.addSuitcase(suitcase);
            ix++;
        }
    }
}


