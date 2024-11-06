import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("Input");
        try (Scanner sc = new Scanner(file)) {
            int i = 0;
            while (sc.hasNextLine()) {
                ++i;
                String line = sc.nextLine();
                if (i % 2 == 1) {
                    System.out.print(line + " ");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}