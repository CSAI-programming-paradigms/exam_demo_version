// Task 4:
// Create a Singleton class `Logger` ensuring only one instance exists.
// Provide a `log(String message)` method that prefixes messages with a timestamp.

import java.time.LocalDateTime;

class Logger {
    private static Logger instance;
    private Logger() { }

    // TODO: implement getInstance()

    public void log(String message) {
        System.out.println("[" + LocalDateTime.now() + "] " + message);
    }
}

public class Main {
    public static void main(String[] args) {
        Logger log1 = Logger.getInstance();
        Logger log2 = Logger.getInstance();

        log1.log("First message");
        log2.log("Second message");
        System.out.println(log1 == log2);  // Expected: true
    }
}
