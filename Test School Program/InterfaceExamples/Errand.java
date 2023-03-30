package InterfaceExamples;

import java.util.Date;

public class Errand implements IScheduleTime {
    private String locaiton;
    private int duration;
    private Date deadLine;

    public boolean schedule(Date date) {
        return false;
    }

    public void completed() {
        System.out.println("The errand has been completed.");
    }
}
