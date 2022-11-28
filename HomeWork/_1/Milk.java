package HomeWork._1;

public class Milk extends Products {
    private int fatness;

    Milk(String name) {
        super(name);
    }

    Milk(String name, Double price) {
        super(name, price);
    }

    Milk(String name, Double price, int fatness) {
        super(name, price);
        this.fatness = fatness;
    }

    public int getFatness() {
        return fatness;
    }

    public void setFatness(int fatness) {
        this.fatness = fatness;
    }

    @Override
    public String toString() {
        return String.format("%s Жирность:%d%% ", super.toString(), getFatness());
    }
}
