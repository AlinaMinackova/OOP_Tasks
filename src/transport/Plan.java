package transport;

import schedule.Schedule;

import java.util.List;
import java.util.Objects;

public class Plan extends AirTransport {

    private Boolean VIPPlaces;

    public Plan(String name, String from, String to, List<Schedule> schedule, List<Conditions> conditions) {
        super(name, from, to, schedule, conditions);
    }

    public Plan(String name, String from, String to, List<Schedule> schedule, List<Conditions> conditions, Boolean VIP) {
        super(name, from, to, schedule, conditions);

        this.VIPPlaces = VIP;
    }


    public void setVIPPlaces(Boolean VIP){
        this.VIPPlaces = VIP;
    }

    public Boolean getVIPPlaces(){
        return VIPPlaces;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n  VIPPlaces " +  getVIPPlaces();
    }
}
