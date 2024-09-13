public class ModernSofa extends Sofa {
  private int price;
  private int quantity;

  public ModernSofa() {

  }

  public ModernSofa(int price, int quantity) {
    this.price = price;
    this.quantity = quantity;
  }

  public int getPrice() {
    return this.price;
  }

  public int getQuantity() {
    return this.quantity;
  }

  @Override
  public boolean hasLegs() {
    return false;
  }

  @Override
  public void sitOn() {
    System.out.println("Modern Sofa sitOn() ...");
  }
}