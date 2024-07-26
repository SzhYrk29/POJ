import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter celsius: ");
        float celsius = scanner.nextInt();

        double fahrenheit = (9.0f/5.0f) * celsius +32;
        System.out.println("The result of conversion is: " + fahrenheit + "F");
    }
}