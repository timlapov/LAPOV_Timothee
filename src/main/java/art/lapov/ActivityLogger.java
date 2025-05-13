package art.lapov;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class ActivityLogger {

    private static ActivityLogger instance;
    private static final ArrayList<String> logs = new ArrayList<>();

    private ActivityLogger() { }

    public static ActivityLogger getInstance() {
        if (instance == null) {
            instance = new ActivityLogger();
        }
        return instance;
    }

    public void logActivity(String message) {
        logs.add(LocalDateTime.now() + " | " +message);
    }

    public ArrayList<String> getActivityLog() {
        return logs;
    }
}
