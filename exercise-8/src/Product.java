public abstract class Product {
    private double price;
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public abstract double getSalePrice();
}
