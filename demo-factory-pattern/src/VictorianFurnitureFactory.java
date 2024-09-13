public class VictorianFurnitureFactory implements FurnitureFactory {
  @Override
  public Chair createChair() {
    System.out.println("VictorianFurnitureFactory creating Chair ...");
    return new VictorianChair();
  }

  @Override
  public Sofa createSofa() {
    System.out.println("VictorianFurnitureFactory creating Sofa ...");
    return new VictorianSofa();
  }

}