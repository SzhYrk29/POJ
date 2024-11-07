import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int input = 0;
        while (input < 10) {
            input = sc.nextInt();
            numbers.add(input);
        }
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }
}