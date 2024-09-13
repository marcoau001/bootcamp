import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class DemoLambdaFunction {
  public static void main(String[] args) {
    // Function.class
    // interface Function<T, R>
    // R apply(T t);
    Function<String, Integer> stringLength = str -> str.length(); // !!! Formula
    System.out.println(stringLength.apply("hello")); // 5

    // Runtime Formula (differs to Class instance method & static method)
    Function<List<String>, Set<String>> lengthlargerThan3 = strings -> {
      Set<String> newStrings = new HashSet<>();
      for (String s : strings) {
        if (s.length() > 3)
          newStrings.add(s);
      }
      return newStrings;
    };

    List<String> stringList = Arrays.asList("abcd", "abc", "abcd", "abcde");
    Set<String> stringSet = lengthlargerThan3.apply(stringList);
    System.out.println(stringSet); // [abcd, abcde]

    // BiFunction.class
    // interface BiFunction<T, U, R>
    // R apply(T t, U u);
    BiFunction<String, String, String> concat = (s1, s2) -> s1.concat(s2);
    System.out.println(concat.apply("hello", "world")); // helloworld

    // Consumer.class
    // interface Consumer<T> {
    // void accept(T t);
    Consumer<List<String>> printer = strings -> {
      for (String s : strings) {
        System.out.println(s);
      }
    };
    printer.accept(stringList);

    BiConsumer<Map<Integer, String>, Integer> printMapValue =
        (map, key) -> System.out.println(map.get(key));

    Map<Integer, String> nameMap = new HashMap<>();
    nameMap.put(1, "John");
    nameMap.put(2, "Peter");
    printMapValue.accept(nameMap, 2);

    // Supplier
    // Supplier<T>
    // T get();

    // !!! "() -> Math.random()" is a formula to return Double, but not return
    // Double
    Supplier<Double> randomNumber = () -> Math.random();
    System.out.println(randomNumber.get()); // 0.7004155383970254

    Function<Integer, Integer> randomNumber2 =
        to -> new Random().nextInt(to) + 1;
    System.out.println(randomNumber2.apply(100)); // (random number between 1 -
                                                  // 100)

    // Predicate<T>
    // boolean test(T t);
    // !!! "customer -> customer.getAge() >= 18" is a formula to return
    // true/false
    Predicate<Customer> isAdult = customer -> customer.getAge() >= 18;
    System.out.println(isAdult.test(new Customer(18))); // true
    System.out.println(isAdult.test(new Customer(17))); // false

    Predicate<Customer> isNameStartsWithA =
        customer -> customer.getName().startsWith("A");

    // Test
    System.out
        .println(isAdult.and(isNameStartsWithA).test(new Customer(18, "Alex"))); // true
    System.out.println(
        isAdult.and(isNameStartsWithA).test(new Customer(18, "Peter"))); // false
    System.out.println(
        isAdult.or(isNameStartsWithA).test(new Customer(18, "Peter"))); // true

    BiPredicate<Customer, Customer> isOlderThan =
        (c1, c2) -> c1.getAge() > c2.getAge();
    System.out.println(isOlderThan.test(new Customer(20), new Customer(19))); // true

    // UnaryOperator<T> extends Function<T, T>
    UnaryOperator<String> replaceSpaceByEmptyString = s -> s.replace(" ", "");
    System.out.println(replaceSpaceByEmptyString.apply("hello world !!!"));
    // Alternative
    Function<String, String> replaceSpaceByEmptyString2 =
        s -> s.replace(" ", "");
    System.out.println(replaceSpaceByEmptyString2.apply("hello world !!!"));

    // BinaryOperator<T>
    BinaryOperator<String> firstCharacters = (s1, s2) -> {
      String result = "";
      if (s1 != null && s1.length() > 0)
        result += s1.charAt(0);
      if (s2 != null && s2.length() > 0)
        result += s2.charAt(0);
      return result;
    };
    System.out.println(firstCharacters.apply("abc", "ijk")); // ai

  }
}