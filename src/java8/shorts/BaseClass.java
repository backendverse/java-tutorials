package java8.shorts;

public class BaseClass {
    private int createdAt;
    private String name;

    public BaseClass() {
    }

    public BaseClass(int createdAt, String name) {
        this.createdAt = createdAt;
        this.name = name;
    }

    public int getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(int createdAt) {
        this.createdAt = createdAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
