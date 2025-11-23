void main() {

    // 1 String (Immutable)
    String s = "Hello";
    s = "Hello World";   // New object created
    System.out.println(s);


    //2 StringBuffer (Mutable + Thread-Safe)
    //✔ Thread safe
    //✔ Slow because of synchronization
    StringBuffer sb = new StringBuffer("String");
    sb.append(" Buffer");   // Same object modified
    System.out.println(sb);


    //3 StringBuilder (Mutable + Fastest)
    // ✔ Fastest because no thread-safety
    StringBuilder sb2 = new StringBuilder("String");
    sb2.append(" Builder");   // Same object modified
    System.out.println(sb2);

}