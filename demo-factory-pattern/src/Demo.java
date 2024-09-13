import java.util.List;

public class Demo {

  public static int totalCheckoutAmount(List<Furniture> furnitures) {
    int total = 0;
    for (Furniture furniture : furnitures) {
      total += furniture.getPrice() * furniture.getQuantity();
    }
    return total;
  }

  public static void main(String[] args) {
    Style style = Style.MODERN;
    // !!!! open-close coding style
    FurnitureFactory factory = FurnitureFactory.of(style);
    Furniture furniture = factory.createChair();
    Furniture furniture2 = factory.createSofa();
  }
}