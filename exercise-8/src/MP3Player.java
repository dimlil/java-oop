public class MP3Player extends Electronics {
    private Color color;

    public Color getColor() {
        return color;
    }

    public void setColor(Color colour) {
        this.color = colour;
    }

    @Override
    public double getSalePrice() {
        return this.getPrice() * 0.95;
    }
}
