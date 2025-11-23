import shorts.Student;

void main() {

    List<Integer> list = List.of(1, 3, 4, 1, 3);
    list.stream().distinct()
            .forEach(System.out::println);

    System.out.println();

    List<Student> students = List.of(
            new Student("3", "student 3"),
            new Student("1", "student 1"),
            new Student("2", "student 2"),
            new Student("1", "student 1"),
            new Student("2", "student 2")
    );



    students.stream().distinct()
            .forEach(System.out::println);
}