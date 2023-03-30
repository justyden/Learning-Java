package InterfaceExamples;

import java.util.Date;

public class Cleaning implements IScheduleTime {
    private String location;
    private int duration;
    private Date deadLine;

    public boolean schedule(Date date) {
        return false;
    }

    public void completed() {
        System.out.println("Completed");
    }
}
