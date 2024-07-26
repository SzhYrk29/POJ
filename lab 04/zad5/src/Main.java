public class Main {
    public static void main(String[] args) {
        System.out.println("1 wiatrak: ");
        Wiatrak w1 = new Wiatrak();
        System.out.println(w1.Information());
        System.out.println("2 wiatrak: ");
        Wiatrak w2 = new Wiatrak(Wiatrak.MEDIUM, true, 12, "purple");
        System.out.println(w2.Information());
    }
}