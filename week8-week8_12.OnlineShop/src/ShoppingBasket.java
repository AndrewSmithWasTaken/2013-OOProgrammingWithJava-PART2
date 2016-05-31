/**
 *
 * @author andrew
 */
import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {
    private Map<String, Purchase> basket;

    public ShoppingBasket() {
        basket = new HashMap<String, Purchase>();
    }
    
    public void add(String product, int price) {
        if (basket.containsKey(product)) {
//            Purchase p = basket.get(product);
//            p.increaseAmount();
            basket.get(product).increaseAmount();
        }
        else {
//            Purchase pur = new Purchase(product, price);
//            basket.put(product, pur);
            basket.put(product, new Purchase(product, price));
        }
    }
    
    public int price() {
        int tot = 0;
        for (Purchase p : basket.values()) {
            tot += p.price();
        }
        return tot;
    }
    
    public void print() {
        for (Purchase p : basket.values()) {
            System.out.println(p);
        }
    }
}
