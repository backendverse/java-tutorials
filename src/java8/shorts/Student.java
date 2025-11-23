package java8.shorts;

public class Student {
    private String id;
    private String name;
    private String department;
    private int rank;
    private int age;
    private String email;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Student(String id, String name, String department, int rank, int age, String email) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.rank = rank;
        this.age = age;
        this.email = email;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", rank=" + rank +
                '}';
    }
}
