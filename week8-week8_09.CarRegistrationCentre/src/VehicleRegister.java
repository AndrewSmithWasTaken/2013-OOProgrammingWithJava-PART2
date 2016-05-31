import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * @author andrew
 */
public class VehicleRegister {
    
    private HashMap<RegistrationPlate, String> owners = new HashMap<RegistrationPlate, String>();
    
    public boolean add(RegistrationPlate plate, String owner) {
        if (owners.get(plate) != null) {
            return false;
        }
        else {
            owners.put(plate, owner);
            return true;
        }
    }
    
    public String get(RegistrationPlate plate) {
        if (owners.get(plate) == null) {
            return null;
        }
        else {
            return owners.get(plate);
        }
    }
    
    public boolean delete(RegistrationPlate plate) {
        if (owners.get(plate) == null) {
            return false;
        }
        else {
            owners.remove(plate);
            return true;
        }
    }
    
    public void printRegistrationPlates() {
        for (RegistrationPlate r : owners.keySet()) {
            System.out.println(r);
        }
    }
    
    public void printOwners() {
        ArrayList<String> tmp = new ArrayList<String>();
        for (RegistrationPlate r : owners.keySet()) {
            if (tmp.contains(owners.get(r))) {
                continue;
            }
            else {
                tmp.add(owners.get(r));
            }
        }
        for (String s : tmp) {
            System.out.println(s);
        }
    }
}
