import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];

        Random random = new Random();

        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(100);
        }

        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += array[i];
        }

        if (sum%5 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}