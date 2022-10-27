package homeworks.h27_08;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Main {
    private static String format;

    public static void main(String[] args) {
        format = "yyyy-MM-dd HH:mm";
        Calendar calendar = new Calendar();
        Main main = new Main();
        //main.part1(calendar);
        //main.part2(calendar);
        main.part3(format);
        main.part4();


       // System.out.println(date1.plus(1, ChronoUnit.YEARS));


    }



    public void part1(Calendar calendar,String format){

        String kievTimeZone = getUsersTimeZone("Kiev");
        String warshawTimeZone = getUsersTimeZone("Warsaw");
        String londonTimeZone = getUsersTimeZone("London");
        print(format,kievTimeZone,warshawTimeZone,londonTimeZone);
        System.out.println();
        System.out.println("Events on today: " + calendar.getEvents(getDateFromTimeZone(kievTimeZone,format)));
    }

    public void part2(Calendar calendar){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the date: ");
        String usersDate = scanner.nextLine();
        System.out.println("Enter the event: ");
        String event = scanner.nextLine();
        calendar.addEvent(usersDate,event);
        System.out.println("print all events on thi date?: y/n");
        String answer = scanner.nextLine();
        if (answer.equals("y")){
            System.out.println(calendar.getEvents(usersDate));
        }


    }

    public void part3(String format){
        System.out.println("Enter your city: ");
        String usersTimeZone = new Scanner(System.in).nextLine();
        String timeZone = getUsersTimeZone(usersTimeZone);
        print(format,timeZone);


    }

    public void part4(){
        TimeZone timeZone = TimeZone.getDefault();
        LocalDate localDate = LocalDate.now();
        System.out.println("Date after one year: " + localDate.plus(1,ChronoUnit.YEARS));
        System.out.println("Date after one month: " + localDate.plus(1,ChronoUnit.MONTHS));
        System.out.println("Date after one week: " + localDate.plus(1,ChronoUnit.WEEKS));
    }


    public static void print(String  format,String... timeZone){
        Arrays.stream(timeZone).forEach(el ->
                System.out.println(el+ ": " + getDateFromTimeZone(el,format)));
    }


    public static void print(String  format,String timeZone){
        var date = getDateFromTimeZone(timeZone,format);
        System.out.println(date);
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


    private static LocalDate createTempDate(String date,String format){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        return LocalDate.parse(date, formatter);
    }


}
