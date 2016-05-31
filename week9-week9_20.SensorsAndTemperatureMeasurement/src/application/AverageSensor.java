package application;

/**
 *
 * @author andrew
 */
import java.util.List;
import java.util.ArrayList;

public class AverageSensor implements Sensor {
    private List<Sensor> sensors = new ArrayList<Sensor>();
    
    public void addSensor(Sensor additional) {
        this.sensors.add(additional);
    }

    @Override
    public boolean isOn() {
        
    }

    @Override
    public void on() {
    }

    @Override
    public void off() {
    }

    @Override
    public int measure() {
    }
}
