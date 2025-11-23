void main() {





    Function<String, String> function =
     (input) -> input.toUpperCase();

    UnaryOperator<String> unaryOperator =
     (input) -> input.toUpperCase();

    unaryOperator
            .andThen(function)
            .apply("Java 8 Interview");












    System.out.println(
            function.apply("java 8 function")
    );

    System.out.println(
     unaryOperator.apply("java 8 unary operator")
    );
}