import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (b == 0) {
            System.out.println("Nie można dzielic przez 0.");
        } else {
            System.out.println("Wynik: " + a/b);
        }
    }
}