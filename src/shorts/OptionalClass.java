void main() {
    Optional<String> userName = Optional.of("John");

    Optional<String> name = Optional.ofNullable(getName());
    name.ifPresent(n -> System.out.println("Hello " + n));
    String defaultName = name.orElse("BackendVerse");

    System.out.println(defaultName);
}

    private String getName() {
        return null;
    }