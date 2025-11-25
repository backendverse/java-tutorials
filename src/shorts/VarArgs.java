void main() {
    printNumbers(1, 2, 3);
    printNumbers(10, 20);
    printNumbers();
}

void printNumbers(int... numbers) {
    if (numbers.length == 0) {
        System.out.println("No numbers are passed!");
    } else {
        System.out.println("Numbers passed:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}