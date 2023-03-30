package MultiThreadingExamples;

public class ThreadImp extends Thread {
    int MaxCount = 15;
    int delay = 500;
    public int count = 0;

    public void run() {
        System.out.println("Runnable thread starting.");

        try {
            while (count < MaxCount) {
                Thread.sleep(delay);
                System.out.println("ThreadImp thread with count:" + String.valueOf(count));
                ++count;
            }
        } catch (InterruptedException exc) {
            System.out.println("ThreadImp thread interrupted");
        }

        System.out.println("ThreadImp thread terminating.");
    }
}
