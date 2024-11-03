public class Rectangle extends Figure2D {

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        super(new int[] {width, height, width, height});
        this.width = width;
        this.height = height;
    }

    @Override
    public double totalField() {
        return width * height;
    }

    @Override
    public int sumOfEdges() {
        return 2 * (width + height);
    }
}
