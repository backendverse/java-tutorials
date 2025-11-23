package java8.shorts;

public record Person(String name, int age) {

    public Person {
        if (name.isEmpty()) {
            throw new RuntimeException("Name Field Is Required");
        }
    }
}
