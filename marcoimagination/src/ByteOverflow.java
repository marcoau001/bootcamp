import java.util.Arrays;

public class ByteOverflow {
  public static void main(String[] args) {
      byte value = 127;

      for (int i = 0; i < 10; i++) 
          value++;
          System.out.println("Value: " + value);

          char zero = '0';
int asciiCode = (int) zero;
System.out.println(asciiCode);

int[] numbers = { 1, 2, 3, 4, 5 };

// Iterating over array elements using a for loop​
for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}
// Iterating over an array reversely​
for (int i = numbers.length - 1; i >= 0 ; i--) {
    System.out.println(numbers[i]);
}

int[][] arr2d = new int[][] {{1,2,3}, {7,8,9}, {10,1,2}};
for (int i = 0; i < arr2d.length; i++) {
    for (int j = 0; j < arr2d[i].length; j++) {
        System.out.println("row=" + i + ", col=" + j + ", val=" + arr2d[i][j]);
    }
}

String[] colorsArray = new String[5];

// initial array values​
colorsArray[0] = "Red";
colorsArray[1] = "Green";
colorsArray[2] = "Blue";
System.out.println("Original Array:" + Arrays.toString(colorsArray));

int numberOfItems = 3;
// try to add new value at the next position of the array​
colorsArray[numberOfItems] = "Yellow"; // colorsArray[3] = "Yellow"​
System.out.println("Array after adding one element:" + Arrays.toString(colorsArray));

      }
  }
