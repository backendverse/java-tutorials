void main() {
}

// IS-A Relationship (Inheritance)
class Animal {
    void eating() {
        System.out.println("Animal eats food");
    }
}

// Dog IS-A Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// HAS-A Relationship (Composition)
class Engine {
    private String engineName;
}

// Car HAS-A Engine
class Car {
    Engine engine;

    void drive() {
        System.out.println("Car is moving!");
    }
}