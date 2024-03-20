public class TV extends Electronics {
    private double size;
    public double getSize() {
        return size;
    }
    public void setSize(double size) {
        this.size = size;
    }
    @Override
    public double getSalePrice() {
        return this.getPrice() * 0.85;
    }
}
