public class Car {
    private int speed;
    private double regularPrice;
    private double salePrice;

    public double getSalePrice() {
        return this.salePrice;
    }
    public double getRegularPrice() {
        return this.regularPrice;
    }
    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }
    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }
}
