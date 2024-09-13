import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class DemoApplyLambdaFunction {
  public static void main(String[] args) {
    List<String> strings = new LinkedList<>();
    strings.add("abc");
    strings.add("ijk");
    // for-each
    for (String s : strings) {
      System.out.println(s);
    }
    // !!! List.foreach (Java 8) -> Consumer.class
    strings.forEach(s -> System.out.println(s));

    List<Customer> customers =
        Arrays.asList(new Customer(19), new Customer(30));
    // filter customer whose age > 20, and print his age.
    customers.forEach(c -> {
      if (c.getAge() > 20)
        System.out.println(c.getAge());
    });

    Map<String, Integer> nameMap = new HashMap<>();
    nameMap.put("John", 30);
    nameMap.put("Peter", 7);
    // default V computeIfAbsent(K key, Function<? super K, ? extends V>
    // mappingFunction)
    nameMap.computeIfAbsent("Betty", s -> 3);
    System.out.println(nameMap.get("Betty")); // 3
    nameMap.computeIfAbsent("Betty", s -> 4);
    System.out.println(nameMap.get("Betty")); // 3

    nameMap.merge("Betty", 10, (original, multipler) -> original * multipler);
    System.out.println(nameMap.get("Betty")); // 30

    nameMap.merge("Vincent", 10, (original, multipler) -> original * multipler);
    System.out.println(nameMap.get("Vincent")); // 10

    nameMap.put("Oscar", -1);
    System.out.println(nameMap.get("Oscar")); // null

    // All entry'value * 2, if the value is not null
    // otherwise, remove the entry
    for (String key : nameMap.keySet()) { 
      nameMap.merge(key, 2, (x1, x2) -> {
        if (x1 < 0)
          return null;
        return x1 * x2;
      });
    }

    System.out.println(nameMap);

  }
}