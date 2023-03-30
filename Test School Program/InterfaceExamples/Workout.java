package InterfaceExamples;

import java.util.Date;

public class Workout implements IScheduleTime {
    private String gym;
    private int duration;
    private Date day;

    public boolean schedule(Date date) {
        return false;
    }

    public void completed() {
        System.out.println("The workout has been completed.");
    }
}
