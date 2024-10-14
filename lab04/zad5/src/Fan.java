public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    int speed;
    boolean on;
    int radius;
    String color;

    public Fan() {
        speed = SLOW;
        on = false;
        radius = 5;
        color = "Black";
    }

    public Fan (int speed, boolean on, int radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public String Information() {
        return "Speed: " + speed + "\nIs on: " + on + "\nRadius: " + radius + "\nColor: " + color;
    }
}
