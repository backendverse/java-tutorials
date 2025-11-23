import java8.shorts.Student;

void main() {
    Student s1 = new Student("1", "Amit");
    Student s2 = new Student("1", "Amit");

    System.out.println(s1.equals(s2));
    System.out.println(s1.hashCode());
    System.out.println(s2.hashCode());
}