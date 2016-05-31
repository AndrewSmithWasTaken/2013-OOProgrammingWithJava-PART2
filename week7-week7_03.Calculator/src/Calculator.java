
public class Calculator {
    
    private Reader reader;
    private int calcsNum;

    public Calculator() {
        reader = new Reader();
    }
    
    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }
            if (command.equals("sum")) {
                sum();
                calcsNum++;
            } 
            else if (command.equals("difference")) {
                difference();
                calcsNum++;
            } 
            else if (command.equals("product")) {
                product();
                calcsNum++;
            }
        }
        statistics();
    }
    
    private void sum() {
       System.out.print("value1: ");
       int value1 = reader.readInteger();
       
       System.out.print("value2: ");
       int value2 = reader.readInteger();
       
       int sum = value1 + value2;
       System.out.println("sum of the values " + sum);
    }
    
    private void difference() {
       System.out.print("value1: ");
       int value1 = reader.readInteger();
       
       System.out.print("value2: ");
       int value2 = reader.readInteger();
       
       int diff = value1 - value2;
       System.out.println("difference of the values " + diff);
    }
    
    private void product() {
       System.out.print("value1: ");
       int value1 = reader.readInteger();
       
       System.out.print("value2: ");
       int value2 = reader.readInteger();
       
       int prod = value1 * value2;
       System.out.println("product of the values " + prod);
    }
    
    private void statistics() {
        System.out.println("Calculations done " + calcsNum); 
    }
}
