package homeworks.h27_08;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = new Calendar();
        String tz = getUsersTimeZone("New-York");
        String format = "yyyy-MM-dd HH:mm";
        var date = getDateFromTimeZone(tz,format);
        String date2 = "2022-09-05";


        calendar.addEvent(date,"Погулять");
        calendar.addEvent(date,"dsfsf");
        calendar.addEvent(date,"Погулятsdfь");
        calendar.addEvent(date2,"kre");

        System.out.println(calendar.getEvent(date));
        System.out.println(calendar.getEvent(date2));








    }

    public static String getUsersTimeZone(String usersCity){
        String[] timeZones = TimeZone.getAvailableIDs();
        for (String zone: timeZones){
            String[] zoneParts = zone.split("/");
            String city = (zoneParts.length > 1 ? zoneParts[1] : zoneParts[0]);
            if (usersCity.equals(city)){
                return zone;
            }
        }
        return " ";
    }

    public static String getDateFromTimeZone(String timeZoneString,String format){
        Date date   = new Date();
        TimeZone timeZone = TimeZone.getTimeZone(timeZoneString);
        DateFormat dateFormat = new SimpleDateFormat(format);
        dateFormat.setTimeZone(timeZone);
        return dateFormat.format(date);
    }

}
