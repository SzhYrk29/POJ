public abstract class StringUtils {
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
