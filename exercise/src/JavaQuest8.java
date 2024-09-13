public class JavaQuest8 {
    public static void main(String[] args) throws Exception {
      /**
 * Example Output
 * Second Max = 230
 */
//public class JavaQuest8 {
    // Write a loop to find the second max number.
      int[] nums = new int[] { -10, 5, 100, 240, 230, 80 }; // Second Max = 230
      int[] nums2 = new int[] { -10, 5, 100, 120, 240, 200 }; // Second Max = 200
      int[] nums3 = new int[] { -10, 5, 120, -100, 100, 240 }; // Second Max = 120
      int[] nums4 = new int[] { -10, 5, 100, 240, 240, 80 }; // Second Max = 240
  
      // Your program should be able to handle all the above test case.
      // code here ...
      

        int secondMax = findSecondMax(nums);
        System.out.println("Second Max = " + secondMax);

        secondMax = findSecondMax(nums2);
        System.out.println("Second Max = " + secondMax);

        secondMax = findSecondMax(nums3);
        System.out.println("Second Max = " + secondMax);

        secondMax = findSecondMax(nums4);
        System.out.println("Second Max = " + secondMax);
    }

    public static int findSecondMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num >= max) {
                if (num != max) {
                    secondMax = max;
                }
                max = num;
            } else if (num > secondMax) {
                secondMax = num;
            }
        }

        return secondMax;
    
    }
}
