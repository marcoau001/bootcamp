public class VictorianSofa extends Sofa {

    public VictorianSofa() {
  
    }
  
    public VictorianSofa(int price, int quantity) {
      super(price, quantity);
    }
  
    @Override
    public boolean hasLegs() {
      return false;
    }
  
    @Override
    public void sitOn() {
      System.out.println("Victorian Sofa sitOn() ...");
    }
  }