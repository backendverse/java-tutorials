package shorts;

// Comparator
public class Student2 {
    private int rollNo;
    private int marks;
    private String name;

    public Student2(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.marks = marks;
        this.name = name;
    }

    public String toString() {
        return rollNo + " - " + name + " - " + marks;
    }

    public int getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }
}
