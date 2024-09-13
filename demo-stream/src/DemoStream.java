import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DemoStream {
  public static void main(String[] args) {
    // Stream.class
    Stream<String> strings = Stream.of("abc", "def");
    // for-each (Stream cannot use for-each)
    // for (String s : strings) {
    // System.out.println(s);
    // }

    // Both List and Stream can use forEach()
    strings.forEach(s -> {
      System.out.println(s);
    });

    Stream<Customer> customers =
        Stream.of(new Customer(18, "John"), new Customer(20, "Steven"));
    customers.forEach(c -> System.out.println(c.getName() + ", " + c.getAge()));

    // After Java 8, we have Stream.class, which contains lots of powerful
    // method/ functionality
    // !!! 1. Convert List to Stream - stream()
    List<Customer> customers2 =
        Arrays.asList(new Customer(18, "John"), new Customer(20, "Steven"));
    Stream<Customer> customerStream = customers2.stream();
    // !!! 2. Convert Stream to List - collect()
    List<Customer> customers3 = customerStream.collect(Collectors.toList());

    // Stream Object -> filter() + collect()
    // Similar to for loop + if
    List<Customer> customers4 = customers2.stream() // return Stream<Customer>
        .filter(customer -> customer.getAge() > 18) // return Stream<Customer>
        .collect(Collectors.toList()); // return List<Customer>

    System.out.println(customers4); // [Customer(name=Steven, age20)]

    // Stream Object -> map() + collect()
    // similar to for loop + new ArrayList() + add()
    List<String> names = customers2.stream() // return Stream<Customer>
        .map(customer -> customer.getName()) // !!! return Stream<String>
        .collect(Collectors.toList()); // !!! return List<String>
    System.out.println(names); // [John, Steven]

    // filter() can work together with map()
    // 1. filter () before map()
    List<Integer> ages = customers2.stream() //
        .filter(c -> c.getName().startsWith("S")) // return Stream<Customer>
        .map(c -> c.getAge()) // return Stream<Integer>
        .collect(Collectors.toList()); // return List<Integer>
    System.out.println(ages); // [20]

    // 2. map() before filter()
    List<String> names2 = customers2.stream() //
        .map(e -> e.getName()) // Stream<String>
        .filter(name -> name.endsWith("en")) // Stream<String>
        .collect(Collectors.toList()); // List<String>
    System.out.println(names2); // [Steven]

    // count()
    long count = customers2.stream() //
        .count();
    System.out.println(count); // 2

    // Stream object -> mapToInt -> IntStream object -> sum()
    int sumOfAges = customers2.stream() //
        // you can filter here ...
        .mapToInt(c -> c.getAge()) //
        .sum();
    System.out.println(sumOfAges); // 38

    // IntStream object -> max(), min(), average()

    // IntStream -> distinct()

    // Collect to Set

    // Array to IntStream to Stream<Integer> to Set<Integer>
    int[] arr = new int[] {3, 2, 1, 2};
    IntStream ints = Arrays.stream(arr);
    Stream<Integer> integers = ints.boxed();
    Set<Integer> integerSet = integers.collect(Collectors.toSet());
    System.out.println(integerSet); // [1, 2, 3]
  }
}