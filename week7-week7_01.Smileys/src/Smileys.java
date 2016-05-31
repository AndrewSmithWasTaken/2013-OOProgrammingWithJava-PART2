
public class Smileys {

    public static void main(String[] args) {
        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
        printWithSmileys("Arto");
        printWithSmileys("Matti");
    }
    
    private static void printWithSmileys(String characterString) {
        int length = characterString.length();
        printTopBottom(length);
        if (length%2 == 0) {
            System.out.println(":) " + characterString + " :)");
        } else {
        System.out.println(":) " + characterString + "  :)");
        }
        printTopBottom(length);
    }
    
    private static void printTopBottom(int length) {
        int i = 0;
        if (length%2 == 0) {
            while (i < length+6) {
            System.out.print(":)");
            i+=2;
            }
        }
        else {
            while (i < length+7) {
            System.out.print(":)");
            i+=2;
            }
        }
        System.out.println();
    }
}


