public class ConvinienceProduct extends Product {
    private String Type;
    private String brand;

    public ConvinienceProduct(int productId, String name, double price,int quantity, String brand,String Type) {
        super(productId, name, price,quantity);
        this.brand = brand;
        this.Type=Type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }


}
