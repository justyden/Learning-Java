package MultiThreadingExamples;

public class Sender {
    final int sleepTime = 100;

    public synchronized void send(String msg) { // The synchornized keyword makes sure that only one thread operates at
                                                // a time.
        System.out.println("Sending:\t" + msg);
        try {
            Thread.sleep(sleepTime);
        } catch (Exception e) {
            System.out.println("Thread interrupted");
        }
        System.out.println(msg + " sent");
    }
}
