public class Demolf {
  public static void main(String[] args) {
    int x = 30;

    if (x >= 30) {
      System.out.println("x >= 30"); // print
    } else {
      System.out.println("x < 30");
    }

    boolean isXLargerThan30 = x >= 30; // true

    if (isXLargerThan30) {
      System.out.println("x >= 30"); // print
    } else {
      System.out.println("x < 30");
    }

    // 8 primitives, String (equals(), charAt(), length())

    // Example 1
    // 1. Else-if (Avoid event overlap)
    int number = -3;
    if (number > 0) {
      System.out.println("The number is positive.");
    } else if (number < 0) {
      System.out.println("The number is negative.");
    } else {
      System.out.println("The number is zero.");
    }
    // "The number is positive."
    // "The number is negative."

    // Example 2 (Avoid overlap)
    int score = 85;
    if (score >= 90) {
      System.out.println("A");
    } else if (score >= 80 && score < 90) {
      System.out.println("B");
    } else {
      System.out.println("F");
    }

    // Example 3
    int a = 20;
    int b = 10;
    int max; // declaration
    int min;
    if (a > b) {
      max = a; // assignment
      min = b;
    } else {
      max = b;
      min = a;
    }
    System.out.println(max + " is larger than " + min + ".");
    // "20 is larger than 10."

    // Example 4
    String day = "Wednesday";
    // Approach 1
    if ("Wednesday".equals(day)) {
      System.out.println("Wednesday is weekday.");
    } else if ("Monday".equals(day)) {
      System.out.println("Monday is weekday.");
    } else if ("Friday".equals(day)) {
      System.out.println("Friday is weekday.");
    } else if ("Tuesday".equals(day)) {
      System.out.println("Tuesday is weekday.");
    } else if ("Thursday".equals(day)) {
      System.out.println("Thursday is weekday.");
    } else if ("Saturday".equals(day)) {
      System.out.println("Saturday is weekend.");
    } else if ("Sunday".equals(day)) {
      System.out.println("Sunday is weekend.");
    }

    // Approach 2
    if ("Wednesday".equals(day) || "Monday".equals(day) || "Tuesday".equals(day)
        || "Thursday".equals(day) || "Friday".equals(day)) {
      System.out.println(day + "is weekday.");
    } else {
      System.out.println(day + "is weekend.");
    }

    // Approach 3
    boolean weekend =
        "Wednesday".equals(day) || "Monday".equals(day) || "Tuesday".equals(day)
            || "Thursday".equals(day) || "Friday".equals(day) ? false : true;

    if (weekend) {
      System.out.println(day + "is weekend.");
    } else {
      System.out.println(day + "is weekday.");
    }


    // "Wednesday is weekday."
    // "Sunday is weekend."
    // "Saturday is weekend."

    // Example 5
    // Sample out:
    // 7 is an odd number.
    // 8 is an even number.
    int num = 7;
    if (num % 2 == 0) {
      System.out.println(num + "is an even number.");
    } else {
      System.out.println(num + " is an odd number.");
    }



    // Example 6
    // "" ->> empty string
    // sample output:
    // The last character of str is o
    // This is an empty String

    String str = "hello";
    if (str.length() == 0) {
      System.out.println("This is an empty string.");
    } else {
      System.out.println(
          "The last character of str is " + str.charAt(str.length() - 1));
    }


    // Example 7
    // Reversed String
    String s= "abc";
s= ""+ s.charAt(2) +s.charAt(1) + s.charAt(0);
System.out.println(s);


    // The reversed string is cba


    // Example 8
    // Leap Year
    // 1. Divided by 4
    // 2. Not Divided by 100
    // 3. Or divided by 400

    int year = 1900;

    // 1900 is not a leap year.
    if (year % 4 == 0 && year % 100 != 0) {
      System.out.println(year + " is a leap year. ");
    } else if (year % 400 == 0) {
      System.out.println(year + "is a leap year");
    } else {
      System.out.println(year + " is not a leap year");
    }



    // Example 9
    // Eligible to vote
    // Not eligible. Age <18
    // Not eligible. Not a citizen
    // Not eligible. Age <18 and not a citizen

    int age = 18;
    boolean isCitizen = false;

    if (age < 18 && isCitizen) {
      System.out.println("Not eligible. Age <18 and not a citizen");
    } else if (age < 18) {
      System.out.println("Not eligible. Age <18");
    } else if (isCitizen != false) {
      System.out.println("Not a citizen");
    } else
      System.out.println("Eligible to vote");

    // Example 10
    // >= 500.0 -> 20% off
    // >= 200.0 -> 10% off
    // < 200.0 -> no discount

    double TotalPurchase = 199.0;

    double discount = 0.0;

    if (TotalPurchase >= 500.0) {
      discount = 0.2 * TotalPurchase; // 20% discount
    } else if (TotalPurchase >= 200.0 && TotalPurchase < 500 ) {
      discount = 0.1 * TotalPurchase; // 10% discount
    }

    System.out.println("Total amount: $" + TotalPurchase);
    System.out.println("Discount: $" + discount);
    System.out.println("Amount to pay: $" + (TotalPurchase - discount));

    // Eample 11

    // a e i o u -> vowel

    // a is vowel
    // c is consonant

    char ch = 'a';

    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
        || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
      System.out.println(ch + " is a vowel.");
    } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
      System.out.println(ch + " is a consonant.");
    } else {
      System.out.println("Invalid input. Please enter an alphabet.");
    }


    // Teaching
    //
    String s1 = "hello";
    System.out.println(s1.contains("ll"));// true
    System.out.println(s1.contains("lll"));// false
    s1 = "helloll";
    System.out.println(s1.contains("ll")); // true

    // Example 12
    String password = "Admin1234567#";
    // Strong password definition;
    // # ! @ $ -> Special character
    // password length >= 12

    // It is a strong password.
    // It is a weak password. no Special character.
    // It is a weak password. Length <12

    if ((password.length() > 12) && (password.contains("#"))
        || (password.contains("!") || (password.contains("@"))
            || (password.contains("$")) || (password.contains("%"))
            || (password.contains("?")) || (password.contains("*"))
            || (password.contains("&")))) {
      System.out.println("It is a strong password.");
    } else if ((password.length() <= 12) && (password.contains("#"))
        || (password.contains("!") || (password.contains("@"))
            || (password.contains("$")) || (password.contains("%"))
            || (password.contains("?")) || (password.contains("*"))
            || (password.contains("&")))) {
      System.out.println("It is a weak password. Length <12");
    } else
      System.out.println("It is a weak password. no Special character.");


  }
}
