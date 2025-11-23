void main() {










    // WeakHashMap Creation
    Map<Object, String> map = new WeakHashMap<>();

    Object key1 = new Object();
    Object key2 = new Object();

    map.put(key1, "First");
    map.put(key2, "Second");

    System.out.println("Before GC: ");
    map.forEach((key, value) ->
            System.out.println(key + " " + value));

    // remove strong reference
    key2 = null;

    // suggest GC to perform cleanup
    System.gc();

    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
    }

    System.out.println("After GC: ");
    System.out.println(map);
}