public class Race {
    public static void main(String[] args) {
        Competitor[] competitors = new Competitor[3];
        competitors[0] = new Competitor("Denys", 3, 20);
        competitors[1] = new Competitor("Vitya", 2, 16);
        competitors[2] = new Competitor("Artur", 3, 18);

        while (competitors[0].getDistanceCovered() < 50 && competitors[1].getDistanceCovered() < 50 && competitors[2].getDistanceCovered() < 50) {
            competitors[0].run();
            competitors[1].run();
            competitors[2].run();
        }

        if (competitors[0].getDistanceCovered() >= 50) {
            competitors[0].introduceYourself();
        } else if (competitors[1].getDistanceCovered() >= 50) {
            competitors[1].introduceYourself();
        } else {
            competitors[2].introduceYourself();
        }
    }
}
