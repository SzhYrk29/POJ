import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int compare = Compare(num1, num2);
        System.out.println(compare);

        sc.close();
    }

    public static int Compare (int num1, int num2) {
        if (num1 < num2) {
            return 1;
        } else if (num1 == num2) {
            return 0;
        } else {
            return -1;
        }
    }
}