package HomeWork._1;

import java.util.ArrayList;
import java.util.List;

public class HW {
    public static void main(String[] args) {
        List<Products> prods = new ArrayList<>();
        prods.add(new Products("Чипсы", 60.0));
        prods.add(new Products("Масло", 50.0));
        prods.add(new Products("Хлеб", 40.0));
        prods.add(new Products("Снек", 20.0));
        prods.add(new Milk("Молоко", 65.0, 5));
        prods.add(new Nuts("Миндаль", 150.0, 650));

        VendingMachine v1 = new VendingMachine(prods);
        System.out.println(v1);
        System.out.println(v1.getProductsBy(65.0));
        System.out.println(v1.getProductsBy("Миндаль"));

    }
}
