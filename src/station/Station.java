package station;

import transport.Transport;

import java.util.List;

public class Station {

    private String name;
    private List<Transport> transportList;
    private String nameBoss;

    public Station(){}

    public Station(String name, List<Transport> listTransport, String nameConductor){
        this.name = name;
        this.transportList = listTransport;
        this.nameBoss = nameConductor;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setTransportList(Transport train){
        this.transportList.add(train);
    }

    public void setNameBoss(String nameBoss){
        this.nameBoss = nameBoss;
    }

    public String getName(){
        return name;
    }

    public List<Transport> getTransportList(){
        return transportList;
    }

    public String getNameBoss(){
        return nameBoss;
    }

    @Override
    public String toString() {
        return "Name Station " + getName() + "\n" +
                " List of Transports \n" + getTransportList() + "\n" +
                "nameBoss " + getNameBoss();
    }

}
