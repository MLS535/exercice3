package smartDevice;

public abstract class  SmartDevice {
    String company;
    double price;
    int id;

    public SmartDevice(String company, double price, int id) {
        this.company = company;
        this.price = price;
        this.id = id;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "company='" + company + '\'' +
                ", price=" + price +
                ", id=" + id +
                '}';
    }
}
