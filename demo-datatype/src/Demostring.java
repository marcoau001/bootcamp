public class Demostring {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
  // "hello world!!!" -> String value
  
  //String is not a primitive!!!
  String s;
  s = "abc";
  
  String s2 = "def"; // "def is a String value, abd the assign to String value
  // String s3 = 3;
  // String s4 = true;
  
  String s3 = "3"; // Its ok, but you cannot perform Math Operation
  String S3 = " S3 +1 "; // append meaning , but not +1
  // String value + int value
  //String value + string Value
  System.out.println(s3); //"31"
  
  s3= s3 + true;
  System.out.println(s3); // "31true"
  // In String, there is no -, *, /, %
  
  // Example 1
  int age = 40;
  String message = "I'm" + age + "years old.";
  System.out.println(message);
  
  //Example 2 
  char grade = 'A' ;
  System.out.println("my grade of History is" + grade);
  // String + char -> String

  // +=
  String firstname = "vincent";
  String lastname = "Lau";
  String fullname = ""; // empty String value

  fullname += firstname + " "+ lastname;
  // fullname = fullname + firstname + " " +lastname;
  System.out.println(fullname); // vincent Lau

  // primitive -> math operation, comparison (>>,<,>=,<=,==,!=)
  // string -> not primitive, we use method (tool) to compare their values
  String s10 = "hello";
  String s20 = "hello";

  //equals()
  System.out.println(s10.equals(s20)); // true

  boolean isValuesame = "abc".equals(s20); // false

  // CharAt()
  char result = s10.charAt(1); // 2nd char of string value
  System.out.println(result); // 'e'
  System.out.println(s10.charAt(0)); // 'h'
//  System.out.println(s10.charAt(-1)); // index negative -> runtime error
//  System.out.println(s10.charAt(5)); // out range -> runtime error
// s10.charAt(1L); error
// s10.charAt(1.0); error


System.out.println(s10.charAt(2)== 'l'); //true
System.out.println(s10.charAt(1)== 'l'); //false


// length()
System.out.println(s10.length()); //5
System.out.println(s10.length() >= 5); // int 5>= 5? -> true

  
  
    }
  }