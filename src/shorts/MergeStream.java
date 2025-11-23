void main() {
    Stream<String> upper = List.of("Aman", "rohit", "Anshul").stream().map(String::toUpperCase);

    Stream<String> lower = List.of("John", "Ricard", "David").stream().map(String::toLowerCase);

    List<String> list = Stream.concat(upper, lower).toList();

    System.out.println(list);

}