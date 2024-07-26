import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        if (num2 == 0) {
            System.out.print("You cannot divide by zero.");
        } else {
            double result = num1/num2;
            System.out.print("Result of an operation: " + result);
        }
    }
}