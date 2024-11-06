import java.util.*;

public class Main {
    public static void main(String[] args) throws InputMismatchException {
        Set<Integer> playerNumbers = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 6 unique numbers from 1 to 49:");

        try {
            while (playerNumbers.size() < 6) {
                int input = sc.nextInt();

                if (input < 1 || input > 49) {
                    System.out.println("Number should be between 1 and 49.");
                } else if (!playerNumbers.add(input)) {
                    System.out.println("This number has already been entered. Please enter a different number.");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Cannot write a character.");
        }
        System.out.println("Your numbers are: " + playerNumbers);

        Set<Integer> randomNumbers = new HashSet<>();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            randomNumbers.add(random.nextInt(1, 49));
        }
        System.out.println("Random numbers: " + randomNumbers);

        Set<Integer> guessedNumbers = new HashSet<>();

        for (Integer number : playerNumbers) {
            if (randomNumbers.contains(number)) {
                guessedNumbers.add(number);
            }
        }

        System.out.println("You guessed " + guessedNumbers.size() + " numbers, which are: " + guessedNumbers);
    }
}
