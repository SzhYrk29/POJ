public abstract class Figure {
    public abstract double totalField();
    public abstract int sumOfEdges();

    protected int[] edge;

    public Figure(int[] edge) {
        this.edge = edge;
    }

    public Figure() {}
}
