void main() {
    // separate adult vs minor people in 2 different lines

    List<Integer> ages = Arrays.asList(16, 21, 15, 30, 17, 25, 18, 12, 19, 35);

    Map<Boolean, List<Integer>> collect = ages.stream()
            .collect(Collectors.partitioningBy(
                    age -> age > 18
            ));

    System.out.println(collect.get(true));
    System.out.println(collect.get(false));

}