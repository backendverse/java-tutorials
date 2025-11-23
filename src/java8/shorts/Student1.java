package java8.shorts;

// Comparable
public class Student1 implements Comparable<Student1> {
    private int rollNo;
    private String name;

    public Student1(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public String toString() {
        return rollNo + " - " + name;
    }

    @Override
    public int compareTo(Student1 o) {
        return this.rollNo - o.rollNo;
    }

    public String getName() {
        return name;
    }
}
