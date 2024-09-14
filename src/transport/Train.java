package transport;

import schedule.Schedule;

import java.util.List;

public class Train extends GroundTransport {

    private Boolean restaurantPart;

    public Train(String name, String from, String to, List<Schedule> schedule) {
        super(name, from, to, schedule);
    }

    public Train(String name, String from, String to, List<Schedule> schedule, Boolean restsurant) {
        super(name, from, to, schedule);
        this.restaurantPart = restsurant;
    }

    public void setRestaurantPart(Boolean restaurant){
        this.restaurantPart = restaurant;
    }

    public Boolean getRestaurantPart(){
        return restaurantPart;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n  restaurantPart " +  getRestaurantPart();
    }
}
