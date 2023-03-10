import java.util.HashMap;
import java.util.Map;

// Create ShoppingBag class here
public class ShoppingBag<T extends PricedItem<Integer>> {
    private Map<T, Integer> shoppingBag = new HashMap<>();
    public Map<T, Integer> getBag() {
        return this.shoppingBag;
    }
    public void addItem(T item) {
        if (shoppingBag.get(item) != null){
            Integer count = shoppingBag.get(item);
            count++;
            shoppingBag.put(item, count);
        } else {
            shoppingBag.put(item, 1);
        }
    }
    public int getTotalPrice() {
        int total = 0;
        for (T item: shoppingBag.keySet()) {
            total += (item.getPrice() * shoppingBag.get(item));
        }
        return total;

    }
}