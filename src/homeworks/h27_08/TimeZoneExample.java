package homeworks.h27_08;

import java.util.Date;
import java.util.TimeZone;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TimeZoneExample
{
    private  final  String  TIMEZONE_utc   ;
    private  final  String  TIMEZONE_msc   ;
    private  final  String  DATETIME_format;
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public TimeZoneExample()
    {


        TIMEZONE_utc    = "UTC";
        TIMEZONE_msc    = "Europe/Moscow";
        DATETIME_format = "yyyy-MM-dd HH:mm:ss.SS";

        Date date   = new Date();
        TimeZone tm_msk;
        tm_msk = TimeZone.getTimeZone(TIMEZONE_msc);

        DateFormat df_msk;
        df_msk = new SimpleDateFormat(DATETIME_format);

        df_msk.setTimeZone(tm_msk);

        String date_msk = df_msk.format(date);
            System.out.println (date_msk);
    }



    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public static void main(String[] args)
    {
        new TimeZoneExample();
        System.exit(0);
    }
}
