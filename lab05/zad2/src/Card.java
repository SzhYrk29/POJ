public class Card {

    private Color color;
    private Figure figure;
    private Figure[] figures = Figure.values();
    private Color[] colors = Color.values();

    public Card (Color color, Figure figure) {
        this.color = color;
        this.figure = figure;
    }

    @Override
    public String toString() {
        return this.figure + " " + this.color;
    }

    public void deck() {
        for (int i = 0; i < figures.length; i ++) {
            for (int j = 0; j < colors.length; j ++) {
                Card card = new Card(colors[j], figures[i]);
                System.out.println(card);
            }
        }
    }
}
