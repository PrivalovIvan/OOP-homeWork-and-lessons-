package HomeWork._1;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Products> products;
    private final static List<Products> initProduct = new ArrayList<Products>();
    static {
        initProduct.add(new Products("Snikers", 60.0));
    }

    VendingMachine() {
        this(initProduct);
    }

    VendingMachine(List<Products> prods) {
        this.products = prods;
    }

    VendingMachine(String name, Double price) {
        this.products = new ArrayList<>();
        products.add(new Products(name, price));
    }

    Products getProductsBy(String name) {
        for (Products product : products) {
            if (product.getName().contains(name)) {
                return product;
            }
        }
        return null;
    }

    Products getProductsBy(Double price) {
        for (Products product : products) {
            if (product.getPrice().equals(price)) {
                return product;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String result = "";
        for (Products product : products) {
            result = result.concat(product.toString());
        }
        return result;
    }

}
