void main() {

}






void manualResourceCleanUp() {
    BufferedReader br = null;
    try {
    br = new BufferedReader(
            new FileReader("test.txt"));
    System.out.println("File says: " + br.readLine());
    } catch (IOException e) {
        System.out.println("Error: " + e.getMessage());
    } finally {
        // manual cleanup
        try {
            if (br != null) br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

void autoCloseable() {
    try (BufferedReader br = new BufferedReader(new FileReader("test.txt"));) {
        String line = br.readLine();
        System.out.println("File says: " + line);
    } catch (IOException e) {
        System.out.println("Error: " + e.getMessage());
    }
}