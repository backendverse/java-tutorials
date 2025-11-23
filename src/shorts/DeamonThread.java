void main() {
//    userThread();
    mainThread();
}

void userThread() {
    Thread daemonThread = new Thread(() -> {
        while (true) {
            System.out.println("Hello Daemon Thread ..");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    });

    // Set The Thread As Daemon Thread
    daemonThread.setDaemon(true);

    // Start The Daemon Thread
    daemonThread.start();

    // User Thread
    Thread userThread = new Thread(() -> {
        System.out.println("Hello User Thread ..");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("User Thread Finished !");
    });

    // Start User Thread
    userThread.start();
    try {
        userThread.join();
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }

    System.out.println("Main Method Finished");
}

void mainThread() {
    Thread daemonThread = new Thread(() -> {
        while (true) {
            System.out.println("Hello Daemon Thread ..");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    });

    // Set The Thread As Daemon Thread
    daemonThread.setDaemon(true);

    // Start The Daemon Thread
    daemonThread.start();

    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }

    System.out.println("Main Method Finished");
}