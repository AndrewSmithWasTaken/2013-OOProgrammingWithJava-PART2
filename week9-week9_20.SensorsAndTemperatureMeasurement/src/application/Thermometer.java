package application;

/**
 *
 * @author andrew
 */
import java.util.Random;

public class Thermometer implements Sensor {
    private boolean onOff = false;

    @Override
    public boolean isOn() {
        return this.onOff;
    }

    @Override
    public void on() {
        this.onOff = true;
    }

    @Override
    public void off() {
        this.onOff = false;
    }

    @Override
    public int measure() {
        if (isOn()) {
            Random rand = new Random();
            return rand.nextInt(61) -30; 
        }
        throw new IllegalStateException();
    }
    
}
