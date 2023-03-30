package MultiThreadingExamples;

public class ThreadDemo {
    public static void testWithRunnable() {
        Sender sender = new Sender();
        RunnableImp instance = new RunnableImp(sender);
        Thread thread = new Thread(instance);
        thread.start();

        while (instance.count != 20) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException exc) {
                exc.printStackTrace();
            }
        }
    }

    public static void testWithThread() {
        ThreadImp instance = new ThreadImp();
        instance.start();

        while (instance.count != 20) {
            try {
                Thread.sleep(500);
            }

            catch (InterruptedException exc) {
                exc.printStackTrace();
            }
        }
    }

    public static void testWithThreadATM() {
        ATM atm = new ATM(10000);
        ThreadImpATM instance = new ThreadImpATM(atm, "t1");
        instance.start();
    }
}
