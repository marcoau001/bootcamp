public class Order {
  // Item[] items;
  private Status status; // PAIN, ready__to_SHIp, SHipping, Delivered
  //...

  //constructor

  public void  nextStatus() {

  }

  public void setStatus(Status stauts) {
    this.stauts = status;
  }

  public static void main(String[] args) {
    Order order = new Order();
    order.setSatus(Status.PAID); //validation

    order.nextStatus(); // void (PAIN -> Ready_To_SHip)

    order.setStatus(...); //validation
  }
  
}
