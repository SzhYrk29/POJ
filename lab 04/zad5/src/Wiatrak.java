public class Wiatrak {
    static final int SLOW = 1;
    static final int MEDIUM = 2;
    static final int FAST = 3;
    public int speed;
    public boolean on;
    public int radius;
    public String color;

    public Wiatrak() {
        this.speed = FAST;
        this.on = true;
        this.radius = 7;
        this.color = "black";
    }

    public Wiatrak(int speed, boolean on, int radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public String Information() {
        return "Speed: " + this.speed + ", on: " + this.on + ", radius: " + this.radius + ", color: " + this.color;
    }
}
