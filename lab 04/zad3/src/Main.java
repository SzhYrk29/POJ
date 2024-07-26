import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        Punkt p1 = new Punkt();
        Punkt p2 = new Punkt(x, y);
        System.out.println(p1.ObliczOdleglosc1(x, y));
        System.out.println(p1.ObliczOdleglosc2(p2));
    }
}