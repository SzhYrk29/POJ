import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Your array: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Reversed array: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}