import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyCircle circle = new MyCircle(sc.nextInt());

        System.out.println(circle.obwod(circle.r));
        System.out.println(circle.pole(circle.r));
        System.out.println(circle.srednica(circle.r));
    }
}