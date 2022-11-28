package HomeWork._1;

public class Nuts extends Products {
    private int calories;

    Nuts(String name, Double price) {
        super(name, price);
    }

    Nuts(String name) {
        super(name);
    }

    Nuts(String name, Double price, int calories) {
        this(name, price);
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return String.format("%s Колорийность: %d ккал/100г", super.toString(), getCalories());
    }

}
