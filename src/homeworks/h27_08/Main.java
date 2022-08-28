package homeworks.h27_08;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String usersTimeZone = getUsersTimeZone("London");
        TimeZone timeZone = TimeZone.getTimeZone(usersTimeZone);
        Calendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeZone(timeZone);
        var q = timeZone.useDaylightTime();

        String  DATETIME_format;
        DATETIME_format = "yyyy-MM-dd HH:mm:ss.SS";
        DateFormat df_msk;
        df_msk = new SimpleDateFormat(DATETIME_format);
        df_msk.setTimeZone(timeZone);
        Date date = new Date();
        String date_msk = df_msk.format(date);
        System.out.println(date_msk);






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

}
