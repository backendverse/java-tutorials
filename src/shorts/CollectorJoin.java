void main() {

    List<String> list = List.of(
            "Spring Boot",
            "Kafka",
            "Microservices");

    String collect = list
            .stream()
            .collect(Collectors.joining(",","[","]"));

    System.out.println(collect);

}