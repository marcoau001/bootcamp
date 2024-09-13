public class VictorianChair extends Chair {

  public VictorianChair() {

  }

  public VictorianChair(int price, int quantity) {
    super(price, quantity);
  }

  @Override
  public boolean hasLegs() {
    return false;
  }

  @Override
  public void sitOn() {
    System.out.println("Victorian Chair sitOn() ...");
  }
}