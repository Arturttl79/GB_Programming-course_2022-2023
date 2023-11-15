package seminar5_task1;

import java.util.ArrayList;
import java.util.List;

public class Logger {

    private List<String> logs = new ArrayList<>();

    public void log(String message) {
        logs.add(message);
    }

    public List<String> getLogs() {
        return logs;
    }
}