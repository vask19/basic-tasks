package homeworks.h27_08;

import java.time.LocalDateTime;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] timeZone = TimeZone.getAvailableIDs();
        TimeZone africaTimeZone = TimeZone.getTimeZone("Europe/Kiev");
        GregorianCalendar gregorianCalendar = new GregorianCalendar(africaTimeZone);

    }


}
