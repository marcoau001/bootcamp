public abstract class Furniture {
  private int price;
  private int quantity;

  public Furniture() {}

  public Furniture(int price, int quantity) {
    this.price = price;
    this.quantity = quantity;
  }

  public int getPrice() {
    return this.price;
  }

  public int getQuantity() {
    return this.quantity;
  }
  
  abstract boolean hasLegs();

  abstract void sitOn();
}