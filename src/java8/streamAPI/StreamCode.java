package java8.streamAPI;

import java8.streamAPI.dto.Employee;
import java8.streamAPI.dto.User;

import java.util.*;
import java.util.stream.Collectors;

public class StreamCode {
    public static void main(String[] args) {
//       map();
//       flatMap();
//        filter();
//        reduce();
//        collectorExample();
        collector();
    }

    static void collector() {
        List<String> names = List.of("Alex", "Rony", "Edwin", "Alex", "Henry", "Edwin");
//
//        Set<String> collect = names.stream()
//                .map(name -> name.toUpperCase())
//                .collect(Collectors.toSet());

//        System.out.println(collect);

//        names = names.stream().distinct().toList();
//        System.out.println(names);

        Map<String, String> collect = names.stream()
                .collect(Collectors.toMap(name -> name.toLowerCase(), name -> name.toUpperCase(), (prev, latest) -> latest));
        System.out.println(collect);


//        List<Employee> employees = Arrays.asList(
//                new Employee("Amit", "IT"),
//                new Employee("Rahul", "HR"),
//                new Employee("Sita", "IT"),
//                new Employee("Priya", "HR"),
//                new Employee("Vikram", "Finance")
//        );
//
//        Map<String, Long> collect = employees.stream().collect(Collectors.groupingBy(e -> e.department(), Collectors.counting()));
//        System.out.println(collect);

    }

    static void filter() {
        List<String> names = List.of("Alex", "Rony", "Edwin", "Henry");
        List<String> upperCaseNames = new ArrayList<>();

//        for (String name : names) {
//            if (name.contains("n")) {
//                upperCaseNames.add(name.toUpperCase());
//            }
//        }

        names = names.stream()
                .filter(name -> name.contains("n"))
                .map(name -> name.toLowerCase())
                .toList();

        System.out.println(names);
    }

    static void reduce() {
        List<Integer> numbers = Arrays.asList(5, 3, 2);

//        int sum = 0;
//        for (Integer number : numbers) {
//            sum += number;
//        }

        Integer sum = numbers.stream().reduce(1, (a, b) -> {
            // Tip: Un-comment the below code to better understand how reduce() works
//            System.out.println("a => " + a + " b=> " + b);
            return a * b;
        });

        System.out.println("Total Sum = " + sum);
    }

    static void map() {
        List<String> names = List.of("Alex", "Rony", "Edwin", "Henry");

//        List<String> upperCaseNames = new ArrayList<>();
//        for (String name : names) {
//            upperCaseNames.add(name.toUpperCase());
//        }

        names.stream().map(name -> name.toUpperCase())
                .forEach(name -> System.out.println(name));

//        System.out.println(names);
    }

    static void flatMap() {
        User user1 = new User("1", List.of("ROLE_ADMIN", "ROLE_USER"));
        User user2 = new User("2", List.of("ROLE_MANAGER", "ROLE_ADMIN"));
        List<User> users = List.of(user1, user2);

//        List<String> roles = new ArrayList<>();
//
//        for (User user : users) {
//            for (String role : user.roles()) {
//                roles.add(role);
//            }
//        }

        List<String> roles = users.stream().flatMap(user -> {
            return user.roles().stream().map(role -> role.toLowerCase());
//            user.roles().stream();
        }).toList();

        System.out.println(roles);

    }

    static void collectorExample() {
        List<Employee> employees = Arrays.asList(
                new Employee("Amit", "IT"),
                new Employee("Rahul", "HR"),
                new Employee("Sita", "IT"),
                new Employee("Priya", "HR"),
                new Employee("Vikram", "Finance")
        );

        Map<String, Long> deptCount = employees.stream()
                .collect(Collectors.groupingBy(e -> e.department(), Collectors.counting()));
        System.out.println(deptCount);
    }
}
