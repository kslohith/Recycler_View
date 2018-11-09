package lohith.com.farmer_connect;

public class ItemDetails {
    String name,desc;
    double price;
    int id;
    int image;

    public ItemDetails(String name, String desc, double price, int id, int image) {
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.id = id;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public int getImage() {
        return image;
    }
}
