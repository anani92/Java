import java.util.ArrayList;
import java.util.List;

public class FoodMenu {
    private final List<Food> menu;

    public FoodMenu() {
        this.menu = new ArrayList<>();
        menu.add(new Food("Burger", "beef patty, cheese, ketchup, mustard", 7));
        menu.add(new Food("Fries", "deep fried potato wedges", 3));
        menu.add(new Food("Milkshake", "chocolate, vanilla, strawberry", 5));
    }



    public Food getFood(int index) {
        if (menu.get(index) != null) {
            return menu.get(index);
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        String menuItems = "";
        for (int i = 0; i < menu.size(); i++) {
            menuItems += (i+ 1) + " " + menu.get(i).toString() +"\n.";
        }
        return menuItems;
    }


    public Food getLowestCostFood() {
        double lowestPrice = Double.POSITIVE_INFINITY;
        Food food = menu.get(0);
        for(Food i : menu) {
            if (i.getPrice() < lowestPrice) {
                lowestPrice = i.getPrice();
                food = i;
            }
        }
        return food;
    }
    public int getMenuItemCount() {
        return menu.size();
    }
}