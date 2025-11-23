void main() {
    Supplier<Integer> supplier =
            () -> Integer.parseInt("90");
    System.out.println("Supplier => " + supplier.get());

    String str = "Backend Verse Is Awesome";

    String result = supplierPredicate(
            str,
            arg -> arg.length() <= 5,
            arg -> arg.toUpperCase(),
            () -> "");

    System.out.println("Result => " + result);
}

<I, R> R supplierPredicate(
        I input,
        Predicate<I> ifCondition,
        Function<I, R> ifFunction,
        Supplier<R> elseFunction) {
    if (ifCondition.test(input)) {
        return ifFunction.apply(input);
    }

    return elseFunction.get();
}