import java.util.Scanner;

public class Reader {
    
    private Scanner reader = new Scanner(System.in);
    
    public String readString() {
        String str = reader.nextLine();
        return str;
    }
    
    public int readInteger() {
        int i = Integer.parseInt(reader.nextLine());
        return i;
    }
}
