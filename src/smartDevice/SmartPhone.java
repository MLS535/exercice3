package smartDevice;

public class SmartPhone extends SmartDevice{
    String model;
    double size;

    public SmartPhone(String company, double price, int id, String model, double size) {
        super(company, price, id);
        this.model = model;
        this.size = size;

    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "company='" + company + '\'' +
                ", price=" + price +
                ", id=" + id +
                ", model='" + model + '\'' +
                ", size=" + size +
                '}';
    }
}
