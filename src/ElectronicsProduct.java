class ElectronicsProduct extends Product {
    private String brand;

    public ElectronicsProduct(int productId, String name, double price,int quantity, String brand) {
        super(productId, name, price,quantity);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}