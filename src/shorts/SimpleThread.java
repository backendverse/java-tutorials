void main() {
//    method();

    Thread thread = new Thread(() -> {
        method();
    });
    thread.start();

    System.out.println("Music Playing");
}

void method() {
    for (int i = 1; i <= 5; i++) {
        System.out.println("Music Downloading: " + i);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}