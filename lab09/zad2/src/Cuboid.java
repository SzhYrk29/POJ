public class Cuboid extends Figure3D {
    private int height;
    private int length;
    private int width;

    public Cuboid (int height, int length, int width) {
        super(new int[] {height, length, width, height, length, width, height, length, width, height, length, width});
        this.height = height;
        this.length = length;
        this.width = width;
    }

    @Override
    public double totalField() {
        return 2 * (length * width + width * height + height * length);
    }

    @Override
    public int sumOfEdges() {
        return 4 * (length + width + height);
    }

    @Override
    public double volume() {
        return length * width * height;
    }
}
