package station;

import transport.GroundTransport;
import transport.Transport;

import java.util.List;

public class StationTrain extends Station {

    Boolean passengerStation;

    public StationTrain(String name, List<Transport> listTransport, String nameConductor) {
        super(name, listTransport, nameConductor);
    }

    public StationTrain(String name, List<Transport> listTransport, String nameBoss, Boolean passenger) {
        super(name, listTransport, nameBoss);

        this.passengerStation = passenger;
    }

    public Boolean getPassengerStation(){
        return passengerStation;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\npassengerStation " +  getPassengerStation();
    }
}
