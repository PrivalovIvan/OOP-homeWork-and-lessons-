package HomeWork._1;

public class Products {
    private String name;
    private Double price;

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    Products(String name, Double price) {
        this(name);
        this.price = price;
    }

    Products(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("\n%s Цена: %,.2f", this.name, this.price);
    }

}
