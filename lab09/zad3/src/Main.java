import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== MENU ===");
        System.out.println("Choose an option:");
        System.out.println("1. Reversing the strings");
        System.out.println("2. Encrypting strings using the Caesar cipher");
        System.out.println("3. Converting string to lowercase letters");
        System.out.println("4. Converting string to uppercase letters");
        System.out.println("============");

        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
                System.out.println("Enter a string:");
                String str = sc.nextLine();
                try {
                    System.out.println(StringUtils.reverseString(str));
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

                break;
                case 2:
                    System.out.println("Enter a string:");
                    String str1 = sc.nextLine();
                    System.out.println("Enter a number:");
                    int shift = sc.nextInt();
                    System.out.println(StringUtils.caesarCipher(str1, shift));
                    break;
                    case 3:
                        System.out.println("Enter a string:");
                        String str2 = sc.nextLine();
                        try {
                            System.out.println(StringUtils.toLowerCase(str2));
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                        case 4:
                            System.out.println("Enter a string:");
                            String str3 = sc.nextLine();
                            try {
                                System.out.println(StringUtils.toUpperCase(str3));
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                            default:
                                break;
        }
    }
}