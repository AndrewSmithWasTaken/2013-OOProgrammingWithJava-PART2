/**
 *
 * @author andrew
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Storehouse {
    private Map<String, Integer> priceList = new HashMap<String, Integer>();
    private Map<String, Integer> stockList = new HashMap<String, Integer>();
    
    public void addProduct(String product, int price, int stock) {
        priceList.put(product, price);
        stockList.put(product, stock);
    }
    
    public int price(String product) {
        if (priceList.containsKey(product)) {
            return priceList.get(product);
        }
        else {
            return -99;
        }
    }
    
    public int stock(String product) {
        if (stockList.get(product) == null) {
            return 0;
        }
        return stockList.get(product);
    }
    
    public boolean take(String product) {
        if (stockList.containsKey(product)) {
            if (stockList.get(product) > 0) {
                stockList.put(product, stockList.get(product) -1);
                return true;
            }
        }
        return false;
    }
    
    public Set<String> products() {
        return stockList.keySet();
    }
}
