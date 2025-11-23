void main() {

    /*
     * Queue in Java follows the FIFO principle:
     * F - First
     * I - In
     * F - First
     * O - Out
     */

    // Creating a queue using LinkedList
    Queue<String> votingQueue = new LinkedList<>();

    votingQueue.add("Aman");
    votingQueue.add("Neha");
    votingQueue.add("Ravi");

    System.out.println("Current Queue: " + votingQueue);

    // Checking first voter (FIFO)
    System.out.println("First Voter : " + votingQueue.peek());

    // Serving first voter (FIFO)
    System.out.println(votingQueue.poll() + " is completed voting...");

    System.out.println("Remaining Queue: " + votingQueue);

    // Checking If All Voters Served
    System.out.println("Check If Empty :" + votingQueue.isEmpty());
}