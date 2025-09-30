package java8.functionalInterfaces;

import java8.functionalInterfaces.dto.UserDTO;
import java8.functionalInterfaces.interfaces.CustomInterface;
import java8.functionalInterfaces.interfaces.MyFunctionalInterface;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalMain {

    public static void main(String[] args) {
//        functionalInterface();
//        predicate();
//        function();
//        supplier();
        consumer();
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
