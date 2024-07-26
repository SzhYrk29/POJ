import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Array in it's usual order:");
        for (int i=0; i<size; i++){
            System.out.println(array[i]);
        }

        System.out.println("Array in reversed order: ");
        for (int i=size-1; i >= 0; i--){
            System.out.println(array[i]);
        }
    }
}