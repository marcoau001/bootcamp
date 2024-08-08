public class JavaQuest5 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        //package questions;

//public class JavaQuest5 {
  /**
   * Expected output:
   * The index of the last character of c is 11
   */
    String str = "coding bootcamp."; // You should not change this line
    char target = 'c'; // Update this target to test the logic

    // if not found, print "Not Found."
    // code here ...
    int lastIndex = -1;

    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == target) {
            lastIndex = i;
        }
    }

    if (lastIndex != -1) {
        System.out.println("The index of the last character '" + target + "' is " + lastIndex);
    } else {
        System.out.println("Not Found.");
    }

  }
}
