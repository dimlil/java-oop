public class Sedan extends Car {
    private int length;
    public int getLength() {
        return this.length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    @Override
    public double getSalePrice() {
        if (this.getLength() > 20) {
            return this.getRegularPrice() * 0.95;
        } else {
            return this.getRegularPrice() * 0.9;
        }
    }
}
