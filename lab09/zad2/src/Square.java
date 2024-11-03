public class Square extends Figure2D {
    private int side;

    public Square(int side) {
        super(new int[] {side, side, side, side});
        this.side = side;
    }

    @Override
    public double totalField() {
        return side * side;
    }

    @Override
    public int sumOfEdges() {
        return side * 4;
    }
}