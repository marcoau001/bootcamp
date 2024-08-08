public class JavaQuest6 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //package questions;

   //public class JavaQuest6 {
  /**
   * Expected output:
   * 0 1 1 2 3 5 8 13 21 ...
   * 
   */
  
    int first = 0, second = 1;
    int count = 15; 

    System.out.print(first + " " + second + " "); \

    for (int i = 2; i < count; i++) {
        int next = first + second; 
        System.out.print(next + " ");
        first = second;
        second = next;
    } 
}
 }


