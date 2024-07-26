import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();

        System.out.println("Area of a circle is " + calculateArea(radius));
        System.out.println("Circumference of a circle is " + calculateCircumference(radius));
    }

    public static double calculateArea(int radius) {
        double result = Math.PI * radius * radius;
        return result;
    }

    public static double calculateCircumference(int radius) {
        double result = 2*radius*Math.PI;
        return result;
    }
}