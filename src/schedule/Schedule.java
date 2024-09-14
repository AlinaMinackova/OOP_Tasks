package schedule;

public class Schedule {

    private String departure;
    private String arrival;

    public Schedule(){}

    public Schedule(String departure, String arrival){
        this.departure = departure;
        this.arrival = arrival;
    }

    public void setDeparture(String departure){
        this.departure = departure;
    }

    public void setNameArrival(String arrival){
        this.arrival = arrival;
    }

    public String getDeparture(){
        return departure;
    }

    public String getNameArrival(){
        return arrival;
    }

    @Override
    public String toString() {
        return "Departure in " + getDeparture() + " " +
                "Arrival in " + getNameArrival();
    }
}
