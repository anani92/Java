import java.util.ArrayList;


public class TestOrders {
    public static void main(String[] args) {

        // Menu items
        Item coffee = new Item("coffee", 3.0);
        Item juice = new Item("Juice", 5.99);
        Item chips = new Item("Chips", 2.5);
        Item late = new Item("late", 9.99);
        // Order variables -- order1, order2 etc.



        Order order1 = new Order("Cindhuri", true);
        Order order2 = new Order( "Jimmy", false );
        Order order3 = new Order("Noah", true);
        Order order4 = new Order("Sam", true);
        order1.setItem(coffee);
        order1.setItem(juice);
        order2.setItem(late);
        order3.setItem(chips);
        order4.setItem(late);
        order3.setItem(coffee);
        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.getTotal());
        System.out.printf("Ready: %s\n", order1.ready);
        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.getTotal());
        System.out.printf("Ready: %s\n", order2.ready);
        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: %s\n", order3.getTotal());
        System.out.printf("Ready: %s\n", order4.ready);
    }
}
