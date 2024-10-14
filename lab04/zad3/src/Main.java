import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        Punkt punkt1 = new Punkt();
        Punkt punkt2 = new Punkt(x, y);
        System.out.println(punkt1.obliczOdleglosc(x, y));
        System.out.println(punkt1.obliczOdleglosc2(punkt2));
    }
}