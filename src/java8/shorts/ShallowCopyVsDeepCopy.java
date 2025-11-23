import java8.shorts.User;

void main() {
    shallowCopyExample();
    deepCopyExample();
}


void shallowCopyExample() {
    System.out.println("===========Shallow Copy Example===========");
    // User Object
    User user = new User("alex", "alex@email.com");
    System.out.println("Original => " + user);

    // Shallow Copy
    User shallowCopy = user;
    shallowCopy.name = "shallow copy user";

    System.out.println("After Change");
    System.out.println("Original => " + user);
    System.out.println("Shallow => " + shallowCopy);
    System.out.println("===========Shallow Copy Example===========");
}

void deepCopyExample() {
    System.out.println("===========Deep Copy Example===========");
    // User Object
    User user = new User("alex", "alex@email.com");
    System.out.println("Original => " + user);

    // Deep Copy
    User deepCopy = new User(user.name, user.email);
    deepCopy.name = "shallow copy user";

    System.out.println("After Change");
    System.out.println("Original => " + user);
    System.out.println("Deep => " + deepCopy);
    System.out.println("===========Deep Copy Example===========");
}