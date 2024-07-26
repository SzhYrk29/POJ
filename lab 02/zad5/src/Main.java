import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[][] seats = new boolean[10][10];
        char input;
        do {
            System.out.println("Choose number of row: ");
            int row = scanner.nextInt();
            System.out.println("Choose number of seat: ");
            int seat = scanner.nextInt();
            if (seats[row][seat]) {
                System.out.println("This seat is already occupied");
            } else {
                seats[row][seat] = true;
                System.out.println("Success!");
            }
            System.out.println("Do you want to continue? (enter 'x' to exit)");
            input = scanner.next().charAt(0);
        } while (input != 'x');

        for (int i=0; i<10; i++) {
            for (int j=0; j<10; j++) {
                if (seats[i][j]) {
                    System.out.print("X ");
                } else {
                    System.out.print("O ");
                }
            }
            System.out.println();
        }
    }
}