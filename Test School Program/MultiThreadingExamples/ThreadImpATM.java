package MultiThreadingExamples;

public class ThreadImpATM extends Thread {
    int MaxCount = 15;
    int delay = 500;
    public int count = 0;
    ATM atm;
    String name;

    public ThreadImpATM(ATM atm, String name) {
        this.atm = atm;
        this.name = name;
    }

    public void run() {
        System.out.println("Runnable thread starting." + name);

        try {
            while (count < MaxCount) {
                Thread.sleep(delay);
                atm.withdraw(100);
                ++count;
            }
        } catch (InterruptedException exc) {
            System.out.println("ThreadImp thread interrupted");
        }

        System.out.println("ThreadImp thread terminating.");
    }
}
