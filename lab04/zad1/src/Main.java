import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Length of first array: ");
        int a = sc.nextInt();
        System.out.println("Length of second array: ");
        int b = sc.nextInt();

        int[] arr1 = new int[a];
        int[] arr2 = new int[b];

        System.out.println("Elements of first array: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Elements of second array: ");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] arr3 = sumOfArrays(arr1, arr2);
        System.out.println("Result: ");

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }

    public static int[] sumOfArrays (int[] arr1, int[] arr2) {

        int[] arr3 = new int[arr1.length];

        if (arr1.length != arr2.length) {
            System.out.println("Error");
        } else {
            for (int i = 0; i < arr1.length; i++) {
                arr3[i] = arr1[i] + arr2[i];
            }
        }
        return arr3;
    }
}