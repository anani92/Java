import java.util.ArrayList;
public class Order {
    String name;
    double total;
    boolean ready;
    ArrayList <Item> items;
    public Order(String name, boolean ready){
      this.name = name;
      this.total = 0;
      this.ready = ready;
      this.items = new ArrayList <Item>();
    }
    public void setItem(Item item){
      this.items.add(item);
      this.total += item.price;
    }
    public double getTotal(){
      return this.total;
    }
}