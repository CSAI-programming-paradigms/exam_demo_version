// Task 5:
// Implement the Observer pattern:
//  - Define interfaces `Subject` and `Observer`.
//  - Create `WeatherStation` (Subject) tracking temperature & humidity.
//  - Create `Display` (Observer) that registers itself and prints updates.

import java.util.ArrayList;
import java.util.List;

// TODO: define Observer interface with update(float temp, float humidity)
// TODO: define Subject interface with registerObserver, removeObserver, notifyObservers()

class WeatherStation /* implements Subject */ {
    // TODO: store observers, temperature, humidity
    // TODO: implement registerObserver, removeObserver, notifyObservers
    // TODO: add setMeasurements(float t, float h) that updates fields & notifies
}

class Display /* implements Observer */ {
    // TODO: constructor taking Subject, registering self
    // TODO: implement update to print: "Current conditions: X°C, Y% humidity"
}

public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        Display disp = new Display(station);

        station.setMeasurements(22.5f, 60.0f);
        // Expected output:
        // Current conditions: 22.5°C, 60.0% humidity
    }
}
