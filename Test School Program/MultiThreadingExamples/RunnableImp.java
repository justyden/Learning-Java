package MultiThreadingExamples;

public class RunnableImp implements Runnable {
    int MaxCount = 15;
    int delay = 500;
    public int count = 0;
    public Sender sender;

    public RunnableImp(Sender s) {
        sender = s;
    }

    public void run() {
        System.out.println("Runnable thread starting.");

        try {
            while (count < MaxCount) {
                Thread.sleep(delay);
                sender.send("Running thread with count:" + String.valueOf(count));
                count++;
            }
        } catch (InterruptedException exc) {
            System.out.println("Runnable thread interrupted.");
        }

        System.out.println("Runnable thread terminating.");
    }
}
