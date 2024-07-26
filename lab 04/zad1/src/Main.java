import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] array1 = new int[a];
        int[] array2 = new int[b];

        System.out.println("First array: ");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int)(Math.random() * 10);
            System.out.print(array1[i] + " ");
        }

        System.out.println();

        System.out.println("Second array: ");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int)(Math.random() * 10);
            System.out.print(array2[i] + " ");
        }

        System.out.println();
        System.out.println("Sum of arrays: ");

        int[] array3 = SumOfArrays(array1, array2);
        for (int i = 0; i < a; i++) {
            System.out.print(array3[i] + " ");
        }
    }

    public static int[] SumOfArrays(int[] array1, int[] array2) {
        int[] array3 = new int[array1.length];
        if (array1.length == array2.length) {
            array3 = new int[array1.length];
            for (int i = 0; i < array1.length; i++) {
                array3[i] = array1[i] + array2[i];
            }
        }
        return array3;
    }
}