public class PC {
    String powerSupply;
    String SSD;
    String motherBoard;
    String memory;
    String CPU;

    public PC(String powerSupply, String SSD, String motherBoard, String memory, String CPU) {
        this.powerSupply = powerSupply;
        this.SSD = SSD;
        this.motherBoard = motherBoard;
        this.memory = memory;
        this.CPU = CPU;
    }

    @Override
    public String toString() {
        return powerSupply + " " + SSD + " " + motherBoard + " " + memory + " " + CPU;
    }
}
