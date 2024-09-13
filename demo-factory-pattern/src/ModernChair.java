public class ModernChair extends Chair {

  public ModernChair() {
    
  }

  public ModernChair(int price, int quantity) {
    super(price, quantity);
  }

  @Override
  public boolean hasLegs() {
    return false;
  }

  @Override
  public void sitOn() {
    System.out.println("Modern Chair sitOn() ...");
  }
}