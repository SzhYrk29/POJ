import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = scanner.nextInt();

        System.out.println("Enter value of the first element: ");
        int firstElement = scanner.nextInt();

        int[] array = new int[size];
        array[0] = firstElement;
        if (array[0] % 2 ==0) {
            array[1] = array[0] + 2;
        } else {
            array[1] = array[0] + 1;
        }

        for (int i=2; i<array.length; i++) {
            array[i] = array[i-1] + 2;
        }

        for (int i=0; i<array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("Min: " + leastNumber(array));
        System.out.println("Max: " + greatestNumber(array));
        System.out.println("Sum: " + sumOfAllElements(array));
        System.out.println("Average: " + averageOfArray(array));
        System.out.println("Median: " + medianIndex(array));
    }

    public static int leastNumber (int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i=0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int greatestNumber (int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i=0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int sumOfAllElements (int[] array) {
        int sum = 0;
        for (int i=0; i<array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static double averageOfArray (int[] array) {
        int sum = 0;
        for (int i=0; i<array.length; i++) {
            sum += array[i];
        }
        int avg = sum/array.length;
        return avg;
    }

    public static double medianIndex (int[] array) {
        return array.length/2;
    }
}