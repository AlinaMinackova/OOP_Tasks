package transport;

import schedule.Schedule;

import java.util.List;

abstract class AirTransport implements Transport{

    private String name;
    private String from;
    private String to;
    private List<Schedule> schedule;
    private List<Conditions> agreeConditions;

    public AirTransport(){}

    public AirTransport(String name, String from, String to, List<Schedule> schedule, List<Conditions> conditions){
        this.name = name;
        this.from = from;
        this.to = to;
        this.schedule = schedule;
        this.agreeConditions = conditions;
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

    public void setAgreeConditions(List<Conditions> agreeConditions) {
        this.agreeConditions = agreeConditions;
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

    public List<Conditions> getAgreeConditions() {
        return this.agreeConditions;
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
                "  List Schedule " + getSchedule() + "\n" +
                "  Agree Conditions " + getAgreeConditions();
    }
}
