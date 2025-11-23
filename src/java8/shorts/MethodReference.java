void main() {

    List<String> names = List.of(
            "Dk Universe", "SumeshIsBack",
            "SaiKrishna", "rishabh");

    names.forEach(name ->
            System.out.println(name));

    names.forEach(System.out::println);

    System.out.println("===STREAM===");

    names.stream()
            .map(name -> name.toUpperCase())
            .forEach(name -> System.out.println(name));

    names.stream()
            .map(String::toUpperCase)
            .forEach(System.out::println);
}