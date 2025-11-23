class SharedData {
    private boolean isDataReady = false;

    // Consumer where threads will wait
    public synchronized void consumer() {
        try {
            System.out.println(Thread
                    .currentThread().getName() +
                    " waiting...");
            while (!isDataReady) {  // condition check
                wait(); // thread goes to waiting state
            }
            System.out.println(Thread
                    .currentThread().getName()
                    + " got the data!");
        } catch (InterruptedException e) {
        }
    }

    // producer call to set data and notify one waiting thread
    public synchronized void producer() {
        isDataReady = true;
        System.out.println("Data Published & calling notify()");
        notifyAll();   // wakes up one waiting thread
        System.out.println("Producer still has the lock... method ending");
    }  // <-- Lock released HERE

}

void main() throws InterruptedException {

    SharedData shared = new SharedData();

    // Two threads waiting for data
    Thread t1 = new Thread(shared::consumer, "Thread-1");
    Thread t2 = new Thread(shared::consumer, "Thread-2");

    t1.start();
    t2.start();

    // Producer thread to notify ONE thread
    Thread.sleep(1000);
    Thread producer = new Thread(shared::producer, "Producer");
    producer.start();

}