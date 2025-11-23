import java8.shorts.AdminUser;

void main() {

    AdminUser defaultConstructor = new AdminUser();

    AdminUser parameterizedConstructor =
    new AdminUser(2, "system_admin");

    AdminUser allArgsConstructor =
    new AdminUser(2, List.of("staff engineer"));
}