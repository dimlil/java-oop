public abstract class Electronics extends Product {
    private Manufacturer manufacturer;

    public Manufacturer geManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }
}
