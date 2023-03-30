package Sensors;

public class HumiditySensor implements Sensor {
    public int get(int humidity) {
        switch (humidity) {
            case 0:
                return 1;
            case 1:
                return 100;
        }
        return 0;
    }
}
