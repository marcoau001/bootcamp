import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.Map;


public class Streamtest {
    public static void main(String[] args) {

      //Example 1
        List<Integer> question1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> result = question1.stream()
                .filter(num -> num % 2 == 0) // Filter even numbers
                .map(num -> num * num) // Square the even numbers
                .sorted((num1, num2) -> Integer.compare(num2, num1)) // Sort in descending order
                .collect(Collectors.toList());

        System.out.println(result); // Output: [64, 36, 16, 4]


        //Example 2
        List<String> question2 = Arrays.asList("Alice", "Bob", "Annie", "David", "Alex");

        List<String> filteredNames = question2.stream()
                .filter(name -> name.startsWith("A")) // Filter names that start with "A"
                .collect(Collectors.toList());

        System.out.println(filteredNames); // Output: [Alice, Annie, Alex]


        //Example 3
        List<Integer> question3 = Arrays.asList(10, 20, 5, 30, 15);

        // Find the maximum value using streams
        int max = question3.stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElseThrow();

        // Find the minimum value using streams
        int min = question3.stream()
                .mapToInt(Integer::intValue)
                .min()
                .orElseThrow();

        System.out.println("Max: " + max); // Output: Max: 30
        System.out.println("Min: " + min); // Output: Min: 5

        //Example 4

        List<String> question4 = Arrays.asList("apple", "banana", "pear");

        List<Integer> lengths = question4.stream()
                .map(String::length) // Map each string to its length
                .collect(Collectors.toList()); // Collect the lengths into a new list

        System.out.println(lengths); // Output: [5, 6, 4]

        //Example 5

        List<String> question5 = Arrays.asList("hi", "hello", "world", "java", "stream");

        long count = question5.stream()
                .filter(word -> word.length() > 3) // Filter strings with length greater than 3
                .count(); // Count the filtered strings

        System.out.println(count); // Output: 4

        //Example 6

        List<Integer> question6 = Arrays.asList(5, 10, 15, 20, 10, 5);

        Set<Integer> filteredNumbers = question6.stream()
                .filter(num -> num > 10) // Filter numbers greater than 10
                .collect(Collectors.toSet()); // Collect the filtered numbers into a Set

        System.out.println(filteredNumbers); // Output: [15, 20]

        //Example 7

        class Student {
          private String name;
          private int score;
      
          public Student(String name, int score) {
              this.name = name;
              this.score = score;
          }
      
          public String getName() {
              return name;
          }
      
          public int getScore() {
              return score;
          }
      }
      
     
              List<Student> students = Arrays.asList(new Student("Alice", 85), new Student("Bob", 75));
      
              Map<String, Integer> studentMap = students.stream()
                      .collect(Collectors.toMap(Student::getName, Student::getScore));
      
              System.out.println(studentMap); // Output: {Alice=85, Bob=75}

          

              //Example 8

              class Employee {
                private String name;
                private int salary;
            
                public Employee(String name, int salary) {
                    this.name = name;
                    this.salary = salary;
                }
            
                public String getName() {
                    return name;
                }
            
                public int getSalary() {
                    return salary;
                }
            }
            
            
                    List<Employee> employees = Arrays.asList(
                            new Employee("John", 65000),
                            new Employee("Jane", 55000),
                            new Employee("Doe", 40000)
                    );
            
                    List<String> filteredEmployeeNames = employees.stream()
                            .filter(employee -> employee.getSalary() >= 50000) // Filter employees with salary >= 50000
                            .map(Employee::getName) // Map employees to their names
                            .collect(Collectors.toList());
            
                    System.out.println(filteredEmployeeNames); // Output: [John, Jane]

          }
    }
