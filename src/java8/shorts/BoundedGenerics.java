void main() {
    // PECS → Producer Extends, Consumer Super

    //(Read Operation) Producer -> ? extends T
    //(Write Operation) Consumer -> ? super T

    // (Producer)
    producer(List.of(1, 2, 3));
    producer(List.of(1.5, 2.5));

    System.out.println();

    // (Consumer)
    List<Number> numbers = new ArrayList<>();
    consumer(numbers);
}

// Producer -> extends (Read Only)
void producer(List<? extends Number> list) {
    double sum = 0;
    for (Number n : list) {
        sum += n.doubleValue();
    }
    System.out.println("Producer: " + sum);

    // Read Only (Producer)
}

// Consumer -> super (Write allowed)
void consumer(List<? super Integer> list) {
    list.add(10);
    System.out.println("Consumer Data Added");

    Object o = list.get(0);
  // Write Allowed (Consumer), Read returns Object

    System.out.println("Consumer: " + o);
}
