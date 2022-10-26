import java.util.ArrayList;

public class OrderKiosk {
  ArrayList <Item> menu;
  ArrayList <Order> orders;

  public OrderKiosk() {
    this.menu = new ArrayList<Item>();
    this.orders = new ArrayList<Order>();
  }

  public void addMenuItem(String name, double price) {
    Item newItem = new Item(name, price);
    this.menu.add(newItem);
    newItem.setIndex(menu.indexOf(newItem));
  }

  public String  displayMenu() {
    String menuItems = "";
    for (Item item : menu) {
      menuItems += item.getIndex() + " - "+ item.getName() + " - "+ item.getPrice() + "\n";
    }
    return menuItems;
  }

  public void newOrder() {


    System.out.println("Please enter customer name for new order:");
    String name = System.console().readLine();

    // Show the user the menu, so they can choose items to add.

    Order new_order = new Order(name);
    this.orders.add(new_order);
    System.out.println(this.displayMenu());

  // Prompts the user to enter an item number
    System.out.println("Please enter a menu item index or q to quit:");
    String itemNumber = System.console().readLine();



    // Write a while loop to collect all user's order items
    while(!itemNumber.equals("q")) {
        int ItemIdx = Integer.parseInt(itemNumber);
        try {
          Item orderItem = this.menu.get(ItemIdx);
          new_order.addItem(orderItem);
          System.out.println("would you like another Item? enter a menu item index or q to quit:");
          itemNumber = System.console().readLine();
        } catch (Exception e) {
          System.out.println("Please enter a valid item number");
          itemNumber = System.console().readLine();
        }

    }

    new_order.display();


  }

  public void addMenuItemByInput() {
    System.out.println("Please enter a menu item name:");
    String itemName = System.console().readLine();
    System.out.println("Please enter a menu item price");
    String price = System.console().readLine();
    int itemPrice = Integer.parseInt(price);
    System.out.println(itemPrice);
    this.addMenuItem(itemName, itemPrice);
  }



}
