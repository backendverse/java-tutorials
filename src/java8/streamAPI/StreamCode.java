package java8.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCode {
    public static void main(String[] args) {
//       map();
//       flatMap();
//        filter();
        reduce();
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
}
