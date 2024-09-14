package transport;

import schedule.Schedule;

import java.util.List;

abstract class GroundTransport implements Transport{

    private String name;
    private String from;
    private String to;
    private List<Schedule> schedule;

    public GroundTransport(){}

    public GroundTransport(String name, String from, String to, List<Schedule> schedule){
        this.name = name;
        this.from = from;
        this.to = to;
        this.schedule = schedule;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setFrom(String from) {
        this.from = from;
    }

    @Override
    public void setSchedule(List<Schedule> schedule) {
        this.schedule = schedule;
    }

    @Override
    public void setTo(String to) {
        this.to = to;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getFrom() {
        return this.from;
    }

    @Override
    public String getTo() {
        return this.to;
    }

    @Override
    public List<Schedule> getSchedule() {
        return this.schedule;
    }

    @Override
    public String toString() {
        return "\n Name Transport " + getName() + "\n" +
         "  From " + getFrom() + "\n" +
        "  To " + getTo() + "\n" +
        "  List Schedule " + getSchedule();
    }
}
