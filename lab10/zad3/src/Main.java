import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024, 11, 6);
        int lengthOfYear = date.lengthOfYear();

        for (int i = 0; i <= 100; i++) {
            if (lengthOfYear == 366) {
                System.out.println(date);
            }
            date = date.plusYears(1);
            lengthOfYear = date.lengthOfYear();
        }
    }
}