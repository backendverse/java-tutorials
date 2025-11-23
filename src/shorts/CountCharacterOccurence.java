void main() {

    // Count Character Occurrence Using Java 8
    String str =
            "Hello Everyone Happy Diwali"
                    .toLowerCase()
                    .replace(" ","");

    Map<Character, Long> collect = str.chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(
                    Function.identity(),
                    Collectors.counting()
            ));

    System.out.println(collect);


}