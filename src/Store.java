import com.workintech.store.enums.Types;
import com.workintech.store.models.Bread;
import com.workintech.store.models.Chocolate;
import com.workintech.store.models.Coke;
import com.workintech.store.models.ProductForSale;
import com.workintech.store.rpg.Banshee;
import com.workintech.store.rpg.Monster;
import com.workintech.store.rpg.Troll;

import java.util.Arrays;

public class Store {
    public static void main(String[] args) {

        ProductForSale[] sales = new ProductForSale[5];

        sales[0] = new Chocolate(Types.DESSERTS, 13.9, "Most Popular", "Brown", true);
        sales[1] = new Bread(Types.OTHERS, 7, "Standart", "Normal", "white");
        sales[2] = new Coke(Types.COOLERS, 9.99, "Zero", false, 0.33);

        ProductForSale[] salesCopy = Arrays.copyOf(sales, 10);

        listProducts(sales);
        System.out.println("****************************");

        Monster banshee1 = new Banshee("Sindel", 100, 500);
        System.out.println(banshee1.attack());
        Monster troll1 = new Troll("Mountain Troll", 250, 300);
        System.out.println(troll1.attack());

    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            if (product != null) {
                product.showDetails();
            }
        }
    }
}