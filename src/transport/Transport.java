package transport;

import schedule.Schedule;
import java.util.List;

public interface Transport {

    default void setName(String name){}


    default void setFrom(String from){

    }

    default void setSchedule(List<Schedule> schedule){

    }

    default void setTo(String to){

    }

    default String getName(){
        return null;
    }

    default String getFrom(){
        return null;
    }

    default String getTo(){
        return null;
    }

    default List<Schedule> getSchedule(){
        return null;
    }
    
}
