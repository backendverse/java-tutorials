void main() {

    // Count Word Occurrence Using Java 8
    List<String> names = Arrays.asList(
            "John", "Alice",
            "Bob", "John", "Alice",
            "John", "Bob", "Charlie");


    Map<String, Long> map = names.stream()
            .collect(
                    Collectors.groupingBy(
                            Function.identity(),
                            Collectors.counting()
                    )
            );

    System.out.println(map);
}