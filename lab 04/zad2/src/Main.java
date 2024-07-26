import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Type any number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Kwadrat MyObj = new Kwadrat(num);
        System.out.println("Obwód kwadratu jest równy: " + MyObj.ObliczObwod());
        System.out.println("Pole kwadratu jest równe: " + MyObj.ObliczPole());
    }
}