package MultiThreadingExamples;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ATM {
    private Lock lock1;
    private double balance = 0;

    public ATM(double balance) {
        this.balance = balance;
        lock1 = new ReentrantLock();
    }

    public double withdraw(double value) {
        lock1.lock();
        double temp = balance;
        try {
            Thread.sleep(100);

            if (balance > value) {
                temp -= value;
                balance = temp;
                System.out.println("ThreadImp thread with balance:" + String.valueOf(balance));
            }
        } catch (InterruptedException exc) {
        }
        lock1.unlock();
        return balance;
    }
}
