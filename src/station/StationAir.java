package station;

import transport.Transport;

import java.util.List;

public class StationAir extends Station {

    Boolean hasShop;

    public StationAir(String name, List<Transport> listTransport, String nameConductor) {
        super(name, listTransport, nameConductor);
    }

    public StationAir(String name, List<Transport> listTransport, String nameBoss, Boolean shop) {
        super(name, listTransport, nameBoss);

        this.hasShop = shop;
    }

    public Boolean getHasShop(){
        return hasShop;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nhasShop " +  getHasShop();
    }
}
