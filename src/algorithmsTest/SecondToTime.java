package algorithmsTest;
import java.time.LocalTime;
public class SecondToTime {
    public static void main(String[] args) {
        int ml = 77682;

        int min = ml / 60;
        int sec = ml - (min * 60);
        int hour = min / 60;
        min = min - (hour * 60);

        LocalTime time = LocalTime.of(hour,min,sec);
        System.out.println(time);




    }

}
