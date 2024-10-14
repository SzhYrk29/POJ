import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int hours, minutes;
        boolean a;
        Scanner sc = new Scanner(System.in);
        while (true) {
            String time = sc.nextLine();
            a = time.contains(":");
            if (!a) {
                System.out.println("Error.");
                continue;
            }
            String[] parts = time.split(":");
            hours = Integer.parseInt(parts[0]);
            minutes = Integer.parseInt(parts[1]);
            if (hours < 0 || hours > 23 || minutes < 0 || minutes > 60) {
                System.out.println("Error.");
                continue;
            }
            break;
        }
        if (hours > 12) {
            System.out.println(hours-12 + ":" + minutes + " PM");
        } else {
            System.out.println(hours + ":" + minutes + " AM");
        }
    }
}