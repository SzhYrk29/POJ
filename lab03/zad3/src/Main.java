import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(compare(a,b));
    }

    public static int compare (int a, int b) {
        if (b>a) {
            return 1;
        } else if (a==b) {
            return 0;
        } else {
            return -1;
        }
    }
}