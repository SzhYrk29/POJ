public class Calculator {

    public int calculate(int a) {
        return a*a;
    }

    public boolean calculate(int a, int b) {
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }

    public int calculate(int a, int b, int c) {
        return a + b + c;
    }
}
