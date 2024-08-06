public class Democomparision { 
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    
      int x=10;
      int y=11;

      boolean isYlargerthanX = y >x;
      System.out.println(isYlargerthanX); // true

      System.out.println(x+3 < y+2); // false
      boolean result = x+3 < y +2; // false

      // ==, !=
      // Single "=" -> Assignment
      int x2 = 3;
      // Double "==" -> Compare if they are equal

      double d1 = 10.4;
      System.out.println(d1 <= 10.4); //true
      // same as int , support all basic operator 

      // more than one event 

      // && = and, || = or ,
      int j1 = 10;
      int j2 = 12;
      System.out.println(j1>j2);//false
      // and or
      System.out.println(j1>j2 || j1 < 11); //false || true -> True        
      System.out.println(j1>j2 && j1 < 11); //false || true -> False    
      
      System.out.println(true && true); // true || true -> true
      System.out.println(true && false); // true || true -> false
      


      }    
    }
