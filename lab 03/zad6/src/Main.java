import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements in the array: ");

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < size; i++) {
            sum += array[i];
        }

        if (sum % 5 == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}