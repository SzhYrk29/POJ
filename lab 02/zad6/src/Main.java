import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] fibonacci = new int[13];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i=2; i<fibonacci.length; i++) {
            fibonacci[i] = fibonacci[i-2] + fibonacci[i-1];
        }

        System.out.println("Fibonacci numbers: ");
        for (int i=0; i<fibonacci.length; i++) {
            System.out.print(fibonacci[i] + ", ");
        }

        System.out.println("\nEnter index of the number you wanna get: ");
        int num = scanner.nextInt();
        System.out.println(fibonacci[num]);
    }
}