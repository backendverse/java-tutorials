void main() {
    // Create Queue Using 2 Stack
    CustomQueue<Integer> queue = new CustomQueue<>();

    queue.push(1);
    queue.push(2);
    queue.push(3);
    queue.push(4);
    queue.push(5);

    System.out.println("POP : " + queue.pop());
    System.out.println("TOP : " + queue.top());
    System.out.println("EMPTY : " + queue.empty());

    while (!queue.empty()) {
        System.out.println(queue.pop());
    }
}

class CustomQueue<T> {

    //  1, 2
    Stack<T> a = new Stack<>();

    //
    Stack<T> b = new Stack<>();

    public void push(T input) {
        if (a.isEmpty()) {
            a.add(input);
        } else {
            b.addAll(a);
            a.clear();
            a.add(input);

            a.addAll(b);
            b.clear();
        }
    }

    public T pop() {
        return a.pop();
    }

    public T top() {
        return a.peek();
    }

    public boolean empty() {
        return a.isEmpty();
    }

}