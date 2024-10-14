public abstract class Shop {
    protected String address;
    protected int size;

    public Shop(String address, int size) {
        this.address = address;
        this.size = size;
    }

    abstract void getInformation();
}
