void main() {
    Child child = new Child();
//    child.show();
    child.display();
}

static class Parent {
    String name = "Parent";

    void show() {
        System.out.println("Hello from Parent");
    }
}

static class Child extends Parent {
    String name = "Child";

    @Override
    void show() {
        System.out.println("Hello from " + this.name);
        System.out.println("Hello from " + super.name);
    }

    void display() {
        this.show();
        super.show();
    }
}
