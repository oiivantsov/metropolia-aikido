import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AikidoTrackerTest {
    private TrackerService tracker;

    @BeforeEach
    void setUp() {
        tracker = new TrackerService();
    }

    @Test
    void testAddPracticeSession() {
        tracker.addSession("2025-02-01", 90);
        assertEquals(90, tracker.getTotalPracticeTime());
    }
}

