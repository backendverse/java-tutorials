package java8.functionalInterfaces;

import java8.functionalInterfaces.dto.Student;
import java8.functionalInterfaces.dto.UserDTO;
import java8.functionalInterfaces.dto.UserRoleDTO;
import java8.functionalInterfaces.interfaces.CustomInterface;
import java8.functionalInterfaces.interfaces.MyFunctionalInterface;

import java.util.*;
import java.util.function.*;

public class FunctionalMain {

    public static void main(String[] args) {
//        functionalInterface();
//        predicate();
//        function();
//        supplier();
//        consumer();
//        NotificationService notificationService = new NotificationServiceImpl();
//
//        notificationService.sendNotification("Abc");
//        notificationService.sendPushNotification();
//
//        NotificationService.pingEmail("ping email");

//        optional();
//        referenceConcept();
//        biPredicate();
//        biFunction();
//        biConsumer();
//        unaryOperator();
//        binaryOperator();

//        comparable();
        comparator();
    }

    static void comparable() {
        List<Student> students = List.of(
                new Student(3, "student 3"),
                new Student(1, "student 1"),
                new Student(2, "student 2"));

        students.stream().sorted().forEach(System.out::println);

    }

    static void comparator() {
        List<Student> students = List.of(
                new Student(3, "Chaudhry", 75),
                new Student(1, "Rahul", 90),
                new Student(4, "Archit", 75),
                new Student(2, "Sahil", 82));

        Comparator<Student> comparator = Comparator.comparing(Student::getMarks)
                .reversed()
                .thenComparing(Student::getName);

        students.stream().sorted(comparator).forEach(System.out::println);
    }

    static void unaryOperator() {
        Function<String, String> function = (input) -> input.toUpperCase();

        UnaryOperator<String> unaryOperator = (input) -> input.toUpperCase();

        System.out.println(unaryOperator.apply("hello world this is alex"));

    }

    static void binaryOperator() {
//        BiFunction<String, String, String> biFunction = (a, b) -> {
//            return a.toUpperCase() + b.toLowerCase();
//        };
//
//        BinaryOperator<String> binaryOperator = (a, b) -> {
//            return a.toUpperCase() + b.toLowerCase();
//        };
//
//        System.out.println(binaryOperator.apply("Hello", "World"));

        Comparator<String> lengthComparator = Comparator.comparingInt(String::length);

        BinaryOperator<String> minLengthString = BinaryOperator.minBy(lengthComparator);
        BinaryOperator<String> maxLengthString = BinaryOperator.maxBy(lengthComparator);

        String str = "Apple";
        String str2 = "Mango";
        String str3 = "WaterMelon";

        System.out.println(minLengthString.apply(str3, str));
        System.out.println(maxLengthString.apply(str3, str2));

    }

    static void biPredicate() {
//        Predicate<String> predicate = (arg) -> arg.length() == 1;
//        System.out.println(predicate.test("Hello"));

        BiPredicate<String, Integer> biPredicate = (name, age) -> {
            return name.length() > 1 && age > 18;
        };

        System.out.println(biPredicate.test("Alex", 22));
    }

    static void biFunction() {
        Function<String, Integer> function = (input) -> Integer.parseInt(input);

        BiFunction<Integer, Integer, Integer> biFunction = (salary, bonus) -> {
            System.out.println("Salary is => " + salary);
            System.out.println("Bonus is => " + bonus);
            return salary + bonus;
        };

        System.out.println(biFunction.apply(50000, 5000));

    }

    static void biConsumer() {
//        Consumer<String> consumer = (salary) -> {
//            System.out.println("Salary is => " + salary);
//        };

        BiConsumer<Integer, String> biConsumer = (salary, empName) -> {
            System.out.println("Emp Name Is => " + empName + " And Salary is => " + salary);
        };

        biConsumer.accept(10000, "Alex");

    }

    static void referenceConcept() {
//        List<String> names = List.of("Alex", "Bob", "Henry");
//        names.forEach(name -> System.out.println(name));

        List<String> names = List.of("Alex", "Bob", "Henry");
        List<UserDTO> userDTOS = names.stream().map(UserDTO::new).toList();
    }

    static void optional() {
        String data = "Hello";
//        data = null;

        Optional<String> optional = Optional.ofNullable(data);

//        if (optional.isEmpty()) {
//            System.out.println("Value is null");
//            return;
//        }
//
//        if (optional.isPresent()) {
//            System.out.println(optional.get());
//        }

//        optional.ifPresent(Inputdata -> {
//            System.out.println(Inputdata);
//        });

//        String output = optional.orElse("Empty Data");


//        String output = optional.orElseGet(() -> {
//            return "Custom SUpplier Data";
//        });

//        System.out.println(output);

//        optional.orElseThrow(() -> new RuntimeException("Null Data Found"));

//        System.out.println(optional.get());

//        String output = optional
//                .map(inputData -> inputData.toUpperCase())
//                .orElseGet(() -> "Empty Data");

//        String output = optional
//                .filter(inputData -> inputData.startsWith("O"))
//                .map(input -> input.toLowerCase())
//                .orElseGet(() -> "Empty Data");

        UserRoleDTO userRoleDTO = new UserRoleDTO();
        UserDTO userDTO = new UserDTO();
        userDTO.setId("1");
        userRoleDTO.setUserDTO(userDTO);

        Optional.ofNullable(userRoleDTO)
                .flatMap(inputData -> Optional.ofNullable(inputData.getUserDTO()))
                .flatMap(userDTO1 -> Optional.ofNullable(userDTO1.getId()))
                .map(inputData -> inputData.toLowerCase())
                .filter(inputData -> !inputData.isEmpty())
                .ifPresentOrElse(userId -> System.out.println("Got the user Id => ".concat(userId)), () -> {
                    System.out.println("Empty Id Found");
                });

    }

    static void supplier() {
        Supplier<Integer> supplier = () -> Integer.parseInt("90");
        System.out.println(supplier.get());
    }

    static void consumer() {
//        Consumer<String> before = (str) -> {
//            System.out.println("Before Consumer");
//        };
//
//        Consumer<String> after = (str) -> {
//            System.out.println("After Consumer");
//        };
//
//        Consumer<String> finalConsumer = before.andThen(after);
//        finalConsumer.accept("Hello World");

        UserDTO userRequest = new UserDTO("1", "Alex", "alex123@gmail.com");

        UserDTO entity = new UserDTO();

        consumerPredicateExecutor(userRequest.getEmail(), FunctionalMain::notEmpty, entity::setEmail);
        System.out.println(entity.getEmail());
    }

    static <I> void consumerPredicateExecutor(I input, Predicate<I> ifCondition, Consumer<I> ifFunction) {
        if (ifCondition.test(input)) {
            ifFunction.accept(input);
        }
    }

    static boolean notEmpty(Object input) {
        return Objects.nonNull(input);
    }

    static void function() {
//        Function<String, Integer> function = (inputString) -> {
//            return Integer.parseInt(inputString);
//        };
//        System.out.println(function.apply("10"));

//        Function<Integer, Integer> times2 = input -> {
//            return input * 2;
//        };
//
//        Function<Integer, Integer> square = input -> {
//            return input * input;
//        };
//
//        Function<Integer, Integer> andThen = times2.andThen(square);
//        System.out.println("And Then Output => " + andThen.apply(3)); //36
//
//        Function<Integer, Integer> compose = times2.compose(square);
//        System.out.println("Compose Output => " + compose.apply(3)); //18

        List<String> outputNames = functionPredicateExecutor(
                List.of("Henry", "Alex"),
                (userInput) -> userInput.stream().anyMatch(user -> "Alexy".equals(user)),
                (usersInput) -> usersInput.stream().map(String::toUpperCase).toList(),
                (userInput) -> userInput.stream().map(String::toLowerCase).toList()
        );

        for (String outputName : outputNames) {
            System.out.println(outputName);
        }
    }

    static <I, R> R functionPredicateExecutor(I input,
                                              Predicate<I> ifCondition, Function<I, R> ifFunction,
                                              Function<I, R> elseFunction) {
        if (ifCondition.test(input)) {
            return ifFunction.apply(input);
        }
        return elseFunction.apply(input);
    }

    static void predicate() {
//        Predicate<String> predicate = (input) -> {
//            return input.toLowerCase().contains("hello");
//        };
//        System.out.println(predicate.test("Hello World"));

        predicateCustomExecutor(
                "Hello World",
                (input) -> input.startsWith("H"),
                () -> {
                    System.out.println("This is our generic body implementation");
                }
        );
    }

    static <I> void predicateCustomExecutor(I input, Predicate<I> predicate,
                                            CustomInterface customInterface) {
        try {
            if (predicate.test(input)) {
                System.out.println("Executing Generic Implementation");
                customInterface.execute();
                System.out.println("Generic Implementation Executed");
            }
        } catch (Exception e) {
            System.out.println("Error occured : " + e);
        }
    }

    static void functionalInterface() {
        //        UniqueConvertor convertor = new UniqueConvertor();
//        Set<String> ans = convertor.operate(List.of("a", "c", "c"));
        MyFunctionalInterface ans = (input) -> new HashSet<>(input);
        Set<String> operate = ans.operate(List.of("a", "c", "c"));
        System.out.println(operate);


        customExecutor(() -> {
            System.out.println("Custom logic");
            throw new RuntimeException("Custom error");
//            System.out.println("Custom logic 2");
        });
    }

    static void customExecutor(CustomInterface customInterface) {
        try {
            customInterface.execute();
        } catch (Exception e) {
            System.out.println("Error occured : " + e);
        }
    }

    static class UniqueConvertor implements MyFunctionalInterface {

        @Override
        public Set<String> operate(List<String> input) {
            return new HashSet<>(input);
        }
    }

}
