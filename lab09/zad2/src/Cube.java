public class Cube extends Figure3D {
    private int side;

    public Cube (int side) {
        super(new int[] {side, side, side, side, side, side, side, side, side, side, side, side});
        this.side = side;
    }

    @Override
    public double totalField() {
        return 6 * Math.pow(side, 2);
    }

    @Override
    public int sumOfEdges() {
        return 12 * side;
    }

    @Override
    public double volume() {
        return Math.pow(side, 3);
    }
}
