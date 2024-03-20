public class Book extends Product {
    private Publisher publisher;
    private int yearPublished;
    public Publisher getPublisher() {
        return publisher;
    }
    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }
    public int getYearPublished() {
        return yearPublished;
    }
    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }
    @Override
    public double getSalePrice() {
        return this.getPrice() * 0.75;
    }
}
