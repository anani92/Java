import java.util.ArrayList;
public class Order {
  private double total;
  private String name;
  private boolean ready;
  private ArrayList <Item> items = new ArrayList <Item>();


  public Order(){
    this.name = "Guest";
    this.ready = false;
  }

  public Order(String name){
    this.name = name;
    this.ready = false;

  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void getStatusMessage() {
    if (this.ready) {
      System.out.println("Your order is ready.");
    } else {
      System.out.println("Thank you for waiting. Your order will be ready soon.");
    }
  }

  public void setOrderReady() {
    this.ready = true;
  }

  public void addItem(Item item) {
    this.items.add(item);
    this.total += item.getPrice();
  }

  public void display() {
    for (Item item :  this.items) {
      System.out.println(item.getName() + " - " +  item.getPrice());
    }
  }

  public double getOrderTotal() {
    return this.total;
  }

}