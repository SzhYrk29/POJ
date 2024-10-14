public class Competitor {
    String name;
    int minSpeed;
    int maxSpeed;
    double distanceCovered;

    public Competitor(String name, int minSpeed, int maxSpeed) {
        this.name = name;
        this.minSpeed = minSpeed;
        this.maxSpeed = maxSpeed;
        this.distanceCovered = 0;
    }

    public void introduceYourself() {
        System.out.printf("I'm %s and I'm running with speed of %d-%d km/h.", name, minSpeed, maxSpeed);
    }

    public void run() {
        this.distanceCovered += Math.random() * ((this.maxSpeed - this.minSpeed + 1) + this.minSpeed);
    }

    public double getDistanceCovered() {
        return this.distanceCovered;
    }
}
