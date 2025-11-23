import shorts.PaginationResponse;

void main() {

    List<?> list = new ArrayList<>();

    // Generic Class Example
    PaginationResponse<List<String>, Integer> response = new PaginationResponse<>();

    response.setTotalCount(10);
    response.setData(List.of("abc", "def"));

    PaginationResponse<Map<String, String>, Long> mapResponse = new PaginationResponse<>();

    mapResponse.setTotalCount(10L);
    mapResponse.setData(Map.of("name", "ronny"));


    // Generic Function Example
    Integer[] intArray = {1, 2, 3, 4};
    String[] strArray = {"Hello", "Generics", "World"};

    printArray(intArray);
    printArray(strArray);
}

<T> void printArray(T[] array) {
    for (T element : array) {
        System.out.println(element);
    }
}