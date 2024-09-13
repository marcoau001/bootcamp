
  
import java.util.Arrays;
import java.util.Scanner;
public class JavaQuest10 {

    public static void main(String[] args) {
  
      int[] my_array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
  
      Scanner input = new Scanner(System.in);
  
      System.out.print("Input an index for inserting the value: ");
      int indexPosition = input.nextInt();
  
      System.out.print("Input the value: ");
      int newValue = input.nextInt();
  
      System.out.println("Original Array : " + Arrays.toString(my_array));
  
      // Check if the index position is the last index
      if (indexPosition == my_array.length - 1) {
        System.out.println("New Array: " + Arrays.toString(my_array));
      } else {
        int[] newArr = new int[my_array.length];
  
        // Shift elements to the right from the specified index position
        for (int i = 0; i < my_array.length; i++) {
          if (i < indexPosition) {
            newArr[i] = my_array[i];
          } else if (i == indexPosition) {
            newArr[i] = newValue;
          } else {
            newArr[i] = my_array[i - 1];
          }
        }
  
        // Display the new array
        System.out.println("New Array: " + Arrays.toString(newArr));
      }
    }
  }

