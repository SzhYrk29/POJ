import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int size = scanner.nextInt();

        char[] array = new char[size];
        for (int i=0; i<size; i++) {
            array[i] = scanner.next().charAt(0);
        }

        for (int i=0; i<size; i++) {
            System.out.print(array[i]);
        }
    }
}