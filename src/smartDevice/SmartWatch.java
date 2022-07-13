package smartDevice;

public class SmartWatch extends SmartDevice{
    int releaseYear;

    public SmartWatch(String company, double price, int id, int releaseYear) {
        super(company, price, id);
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "company='" + company + '\'' +
                ", price=" + price +
                ", id=" + id +
                ", releaseYear=" + releaseYear +
                '}';
    }
}
