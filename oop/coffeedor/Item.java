public class Item {
  private String name;
  private double price;
  private int index;
  public Item(String name, double price) {
    this.name = name;
    this.price = price;
  }
  public void setName(String name){
    this.name = name;
  }
  public void setPrice(double price) {
    this.price = price;
  }
  public double getPrice() {
    return this.price;
  }
  public String getName() {
    return this.name;
  }
  public int getIndex() {
    return this.index;
  }
  public void setIndex(int idx) {
    this.index = idx;
  }
}