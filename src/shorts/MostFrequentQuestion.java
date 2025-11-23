void main() {

//    Find Most Frequent Character
//    in String | Java Streams
    String str = "programming is amazing".replace(" ", "").toLowerCase();

//    Character c1 = str.chars().mapToObj(c -> (char) c)
//            .collect(Collectors.groupingBy(
//                    Function.identity(),
//                    Collectors.counting()
//            )).entrySet().stream().max(Map.Entry.comparingByValue())
//            .map(en -> en.getKey())
//            .orElse(' ');

//    System.out.println(c1);

    Map<Character, Long> freq = str.chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

    System.out.println(freq);

    long max = Collections.max(freq.values());
    char last = ' ';
    for (int i = str.length() - 1; i >= 0; i--)
        if (freq.get(str.charAt(i)) == max) {
            last = str.charAt(i);
            break;
        }

    System.out.println(last);
}