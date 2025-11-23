import java8.shorts.Student1;
import java8.shorts.Student2;

void main() {
    comparable();
    comparator();
}

void comparable() {
    List<Student1> students = List.of(
            new Student1(3, "student3"),
            new Student1(1, "student1"),
            new Student1(2, "student2"));

    System.out.println("Comparable");
    students
            .stream()
            .sorted()
            .forEach(System.out::println);
    System.out.println("Comparable \n");
}

static void comparator() {
    List<Student2> students = List.of(
   new Student2(3, "Chaudhry", 75),
   new Student2(1, "Rahul", 90),
   new Student2(4, "Archit", 75),
   new Student2(2, "Sahil", 82));

    Comparator<Student2> comparator =
            Comparator
            .comparing(Student2::getMarks)
            .reversed()
            .thenComparing(Student2::getName);

    System.out.println("Comparator");
    students
            .stream()
            .sorted(comparator)
            .forEach(System.out::println);
    System.out.println("Comparator");
}