void main() {
    BiFunction<String, String, String> biFunction = (a, b) -> {
        return a.toUpperCase() + b.toLowerCase();
    };

    BinaryOperator<String> binaryOperator = (a, b) -> {
        return a.toUpperCase() + b.toLowerCase();
    };

    System.out.println(binaryOperator.apply("Hello", "World"));

    Map<String, Integer> map = Map.of(
            "A", 1,
            "B", 2,
            "C", 3);

     int result = map
     .values()
     .stream()
     .reduce(0, (a, b) ->  a + b);

     System.out.println("Sum : " + result);
}