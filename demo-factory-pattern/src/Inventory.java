import java.util.ArrayList;
import java.util.List;

public class Inventory {
  public List<Furniture> furnitures = new ArrayList<>();

  public void addChair(Style style) {
    this.furnitures.add(FurnitureFactory.of(style).createChair());
  }

  public void addSofa(Style style) {
    this.furnitures.add(FurnitureFactory.of(style).createSofa());
  }

  public int getQuantity(Type type) {
    int quantity = 0;
    for (Furniture furniture : this.furnitures) {
      if (type == Type.CHAIR && furniture instanceof Chair //
          || type == Type.SOFA && furniture instanceof Sofa) {
        quantity += furniture.getQuantity();
      }
    }
    return quantity;
  }
}