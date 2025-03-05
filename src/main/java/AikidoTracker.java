import java.util.Scanner;

public class AikidoTracker {
    public static void main(String[] args) {
        TrackerService tracker = new TrackerService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Aikido Practice Tracker =====");
            System.out.println("1. Add Practice Session");
            System.out.println("2. View Total Practice Time");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter date (YYYY-MM-DD): ");
                    String date = scanner.nextLine();
                    System.out.print("Enter duration (minutes): ");
                    int duration = scanner.nextInt();
                    tracker.addSession(date, duration);
                    System.out.println("Session added!");
                    break;
                case 2:
                    System.out.println("Total Practice Time: " + tracker.getTotalPracticeTime() + " minutes");
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
