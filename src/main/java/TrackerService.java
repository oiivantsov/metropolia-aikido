import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TrackerService {
    private List<PracticeSession> sessions = new ArrayList<>();
    private LocalDate startDate;

    public void addSession(String date, int duration) {
        LocalDate sessionDate = LocalDate.parse(date);
        if (sessions.isEmpty()) {
            startDate = sessionDate;
        }
        sessions.add(new PracticeSession(sessionDate, duration));
    }

    public int getTotalPracticeTime() {
        int total = 0;
        for (PracticeSession session : sessions) {
            total += session.getDuration();
        }
        return total;
    }

}
