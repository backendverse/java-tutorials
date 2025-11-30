void main() {
    throwExample(17);
    try {
        processFile("invalidfile.txt");
    } catch (IOException e) {
        System.out.println("An error occurred: "
                + e.getMessage());
    }

}

void throwExample(int age) {
    if (age <= 0) {
        throw new ArithmeticException("Invalid Input Age");
    } else {
        System.out.println("You are eligible");
    }
}

void processFile(String fileName) throws IOException {
    FileReader file = new FileReader(fileName);
    BufferedReader fileInput = new BufferedReader(file);
    fileInput.readLine();
    fileInput.close();
}