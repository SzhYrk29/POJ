import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[5];
        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        sc.close();

        System.out.println("Here's the number's you've typed: ");
        for (int n : array) {
            System.out.println(n);
        }

        for (int i = 0; i < array.length; i++) {
            array[i] *= 3;
        }

        System.out.println("Here's the number's in array multiplied by 3: ");
        for (int n : array) {
            System.out.println(n);
        }
    }
}