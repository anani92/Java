public class BaristaTest {
  public static void main(String[] args) {
    Item item1 = new Item("coffee", 1.99);
    Item item2 = new Item("late", 2.99);
    Item item3 = new Item("Tea", 10.99);
    Item item4 = new Item("Vodka", 0.99);

    Order order1 = new Order();
    Order order2 = new Order("Abed");
    Order order3 = new Order("Saad");

    order1.addItem(item4);
    order1.addItem(item4);
    order2.addItem(item2);
    order3.addItem(item4);
    order1.addItem(item1);
    order3.addItem(item3);
    order3.addItem(item4);
    order2.addItem(item3);
    order1.setOrderReady();
    order1.display();
    System.out.println(order1.getOrderTotal());
    order1.getStatusMessage();
  }
}
