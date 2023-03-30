package Sensors;

public class CreateSwitch {
    enum WeekDays {
        Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
    };

    public WeekDays dayOfTheWeek = WeekDays.Friday;

    public boolean IsWorkingDay(WeekDays day) {
        switch (day) {
            case Monday:
                return true;
            case Tuesday:
                return true;
            case Wednesday:
                return true;
            case Thursday:
                return true;
            case Friday:
                return true;
            case Saturday:
                return false;
            case Sunday:
                return false;
        }
        return false;
    }
}
