import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println("Pole koła: " + obliczPole(r));
        System.out.println("Obwód koła: " + obliczObwod(r));
    }

    public static double obliczPole (int a) {
        return Math.PI*a*a;
    }

    public static double obliczObwod (int b) {
        return 2*Math.PI*b;
    }
}