
    public class StringSwapExample {
      public static void main(String[] args) {
          String str = "Hello";
          
          char[] chars = str.toCharArray();
          
          for (int i = 0; i < chars.length; i++) {
              System.out.println("i=" + i + ", char[" + i + "]=" + chars[i]);
          }
          // what is the output?​
      }
  }
