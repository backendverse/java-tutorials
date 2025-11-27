void main() {
    QueueBuilder builder = new QueueBuilder();
    builder.push(3);
    builder.push(4);
    builder.push(5);

    System.out.println("POP : " + builder.pop());
    System.out.println("TOP : " + builder.top());
    System.out.println("EMPTY : " + builder.empty());
}

static class QueueBuilder {
    Queue<Integer> a = new ArrayDeque<>();
    Queue<Integer> b = new ArrayDeque<>();

    public void push(Integer input) {
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

    public Integer pop() {
        return a.poll();
    }

    public Integer top() {
        return a.peek();
    }

    public boolean empty() {
        return a.isEmpty();
    }
}