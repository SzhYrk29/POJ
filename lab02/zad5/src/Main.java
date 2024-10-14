import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[][] cinema = new boolean[6][6];
        char input;

        do {
            System.out.println("Choose raw and seat number: ");
            System.out.print("Raw: ");
            int row = sc.nextInt();
            System.out.print("Seat: ");
            int seat = sc.nextInt();
            if (cinema[row][seat]) {
                System.out.println("This seat is already taken.");
            } else {
                cinema[row][seat] = true;
                System.out.println("Success!");
            }

            System.out.println("Do you want to make another reservation? (enter 'x' to exit)");
            input = sc.next().charAt(0);
        } while (input != 'x');

        for (int i = 0; i < cinema.length; i++) {
            for (int j = 0; j < cinema.length; j++) {
                if (cinema[i][j]) {
                    System.out.print("X ");
                } else {
                    System.out.print("O ");
                }
            }
            System.out.println();
        }
    }
}