import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        MyCircle myCircle = new MyCircle(radius);
        System.out.println("Obwód koła jest równy " + myCircle.ObliczObwod(radius));
        System.out.println("Pole koła jest równe " + myCircle.ObliczPole(radius));
        System.out.println("Średnica koła jest równa " + myCircle.ObliczSrednice(radius));
    }
}