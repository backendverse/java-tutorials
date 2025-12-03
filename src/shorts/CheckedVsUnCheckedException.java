void main() {
    checkedException();
    unCheckedException();
}

void checkedException() {
    try {
        FileReader fr =
              new FileReader("test.txt");
    } catch (IOException e) {
        System.out.println("Checked Exception: File not found!");
    }
}

void unCheckedException() {
    try {
        int x = 10 / 0;
    } catch (ArithmeticException e) {
        System.out.println("Unchecked Exception: Cannot divide by zero!");
    }
}