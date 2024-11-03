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

        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
                System.out.println("Enter a string:");
                String str = sc.nextLine();
                try {
                    System.out.println(reverseString(str));
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

                break;
                case 2:
                    System.out.println("Enter a string:");
                    String str1 = sc.nextLine();
                    System.out.println("Enter a number:");
                    int shift = sc.nextInt();
                    System.out.println(caesarCipher(str1, shift));
                    break;
                    case 3:
                        System.out.println("Enter a string:");
                        String str2 = sc.nextLine();
                        try {
                            System.out.println(toLowerCase(str2));
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                        case 4:
                            System.out.println("Enter a string:");
                            String str3 = sc.nextLine();
                            try {
                                System.out.println(toUpperCase(str3));
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                            default:
                                break;
        }
    }

    public static String reverseString(String str) throws Exception {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);

        }

        if (str.equals(reversed)) {
            throw new Exception("Strings cannot be equal.");
        }

        return reversed;
    }

    public static String caesarCipher(String str, int shift) {
        StringBuffer result = new StringBuffer();
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            int charPosition = alphabet.indexOf(c);

            if (charPosition < 0) {
                result.append(c);
            } else {
                int newKey = (charPosition + shift) % alphabet.length();
                char newValue = alphabet.charAt(newKey);
                result.append(newValue);
            }
        }
        return result.toString();
    }

    public static String toLowerCase(String str) throws Exception {
        String newStr = str.toLowerCase();

        if (str.equals(newStr)) {
            throw new Exception("Strings cannot be equal.");
        }

        return newStr;
    }

    public static String toUpperCase(String str) throws Exception {
        String newStr = str.toUpperCase();

        if (str.equals(newStr)) {
            throw new Exception("Strings cannot be equal.");
        }

        return newStr;
    }
}