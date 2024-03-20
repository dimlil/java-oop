public class Ford extends Car {
    private int year;
    private int manufacturerDiscount;

    public int getYear() {
        return this.year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getManufacturerDiscount() {
        return this.manufacturerDiscount;
    }
    public void setManufacturerDiscount(int manufacturerDiscount) {
        this.manufacturerDiscount = manufacturerDiscount;
    }
    @Override
    public double getSalePrice() {
        return this.getRegularPrice() - this.getManufacturerDiscount();
        
    }
}
