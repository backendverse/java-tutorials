void main() {

    Stack<Integer> stack = new Stack<>();

    stack.push(1);
    stack.push(2);
    stack.push(3);

    System.out.println("Stack Data : " + stack);

    System.out.println("Top Element : " + stack.peek());

    System.out.println("Pop Operation : " + stack.pop());

    System.out.println("After Pop Operation : " + stack);

    System.out.println("Check If Empty :" + stack.isEmpty());
}