public class Dog {
    public void bark() {
        System.out.println("Bark");
    }

    public void bark(int n) {
        for (int i = 0; i < n; i++) {
            bark();
        }
    }
}
