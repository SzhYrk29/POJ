import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Kwadrat kwadrat = new Kwadrat(sc.nextInt());

        System.out.println("Pole kwadratu: " + kwadrat.obliczPole(kwadrat.bok));
        System.out.println("Obwód kwadratu: " + kwadrat.obliczObwod(kwadrat.bok));
    }
}