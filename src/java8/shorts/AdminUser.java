package java8.shorts;

import java.util.List;

public class AdminUser {

    private int id;
    private String name;
    private List<String> roles;

    public AdminUser() {
    }

    public AdminUser(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public AdminUser(int id, List<String> roles) {
        this.id = id;
        this.roles = roles;
    }

    public AdminUser(int id,
                     String name,
                     List<String> roles) {
        this.id = id;
        this.name = name;
        this.roles = roles;
    }
}
