void main() {

    Predicate<String> predicate = (input) -> {
        return input.toLowerCase().contains("h");
    };

    System.out.println(predicate.test("Hello World"));

    predicateCustomExecutor(
            List.of(9, 8, 7, 5, 1),
            (input) -> input.stream().anyMatch(i -> i % 2 == 0),
            () -> {
                System.out.println("This is our generic body implementation");
            }
    );
}

<I> void predicateCustomExecutor(
        I input,
       Predicate<I> predicate,
       Runnable runnable) {
    try {
        if (predicate.test(input)) {
            System.out.println("Executing Generic Implementation");
            runnable.run();
            System.out.println("Generic Implementation Executed");
        }
    } catch (Exception e) {
        System.out.println("Error occurred : " + e);
    }
}