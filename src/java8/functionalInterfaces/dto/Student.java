package java8.functionalInterfaces.dto;

//public class Student implements Comparable<Student> {
public class Student  {
    private int rollNo;
    private int marks;
    private String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.marks = marks;
        this.name = name;
    }

    public String toString() {
        return rollNo + " - " + name + " - " + marks;
    }

    // ascending
    // 1, 3, 2
    // 1, 2, 3

     // if return value is {-ve} then o1 comes first
     // if return value is {0} then both are equal in sorting order and the insertion order will be preserved
     // if return value is {+ve} then o2 comes first

    // descending
    // 3, 1, 2
    // 3, 2, 1

//    @Override
//    public int compareTo(Student o) {
//        System.out.println("Comparing { " + o.name + ", " + this.name + " }");
////        return this.rollNo - o.rollNo;
//        return o.rollNo - this.rollNo;
//    }

    public int getRollNo() {
        return rollNo;
    }

    public int getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }
}
