import java8.functionalInterfaces.dto.UserDTO;

void main() {
//    example();
//    andThen();
    genericUsecase();
}

void example() {
    Consumer<String> consumer = (str) -> {
        System.out.println(str.toUpperCase());
    };

    consumer.accept("Java Is Awesome");
}

void andThen() {
    Consumer<String> before = (str) -> {
        System.out.println("Before Consumer : " + str.toUpperCase());
    };

    Consumer<String> after = (str) -> {
        System.out.println("After Consumer : " + str.toLowerCase());
    };

    Consumer<String> finalConsumer =
            before
                    .andThen(after);
    finalConsumer.accept("Hello World");
}

void genericUsecase() {
    //    Generic Use Case
    UserDTO userRequest = new UserDTO(
            "1",
            "Alex",
            "alex123@gmail.com");

    UserDTO entity = new UserDTO();

    genericConsumerRunner(
            userRequest.getEmail(),
            Objects::nonNull,
            entity::setEmail
    );
    System.out.println(entity.getEmail());
}


<I> void genericConsumerRunner(
        I input,
        Predicate<I> ifCondition,
        Consumer<I> ifFunction) {
    if (ifCondition.test(input)) {
        ifFunction.accept(input);
    }
}