package homeworks.h27_08;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Calendar {
    private Map<String , List<String >> events;


    public Calendar() {
        this.events =  new HashMap<>();
    }

    public List<String> getEvents(String date){
        return events.get(checkAndSubstringDate(date));
    }

    public void addEvent(String date, String event){
        List<String> eventList = getEvents(date);
        if (eventList == null){
            eventList = new ArrayList<>();
            eventList.add(event);
            events.put(checkAndSubstringDate(date),eventList);
        }
        else eventList.add(event);

    }



    public String checkAndSubstringDate(String date){
        if (date.matches("\\d{4}-\\d{2}-\\d{2}.*")){
            return date.substring(0,10);
        }
        return "";

    }

}
