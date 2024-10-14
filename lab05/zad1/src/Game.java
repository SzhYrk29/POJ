import java.util.Scanner;

public class Game {
    public void start() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of numbers to be drawn: ");
        int range = sc.nextInt();
        int random = (int)(Math.random()*range);
        int counter = 0;
        while (counter <= 5) {
            System.out.println("Now you need to guess the number: ");
            int guess = sc.nextInt();

            counter++;

            if (guess > random) {
                System.out.printf("Too big. %d attempts left.\n", 5 - counter);
            } else if (guess < random) {
                System.out.printf("Too small. %d attempts left.\n", 5 - counter);
            } else {
                System.out.println("You got the number " + guess + ".");
                break;
            }

            if (counter == 5) {
                System.out.println("You lost.");
                break;
            }
        }
        sc.close();
    }
}
