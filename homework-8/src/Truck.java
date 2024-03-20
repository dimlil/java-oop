public class Truck extends Car {
    private int weight;

    public int getWeight() {
        return this.weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public double getSalePrice() {
        if (this.getWeight() > 2000) {
            return this.getRegularPrice() * 0.9;
        } else {
            return this.getRegularPrice() * 0.8;
        }
    }
}
