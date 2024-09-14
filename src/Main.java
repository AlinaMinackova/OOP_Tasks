import java.util.ArrayList;
import java.util.List;
import schedule.Schedule;
import station.Station;
import station.StationAir;
import station.StationTrain;
import transport.*;

public class Main {

    public static void main(String[] args) {

        Schedule schedule = new Schedule("12-03-2024", "16-03-2024");
        Schedule schedule2 = new Schedule("09-07-2024", "15-07-2024");
        Schedule schedule3 = new Schedule("01-10-2024", "16-10-2024");

        List<Schedule> schedulesOne = new ArrayList<>();
        schedulesOne.add(schedule);
        schedulesOne.add(schedule3);

        List<Schedule> schedulesTwo = new ArrayList<>();
        schedulesTwo.add(schedule2);
        schedulesTwo.add(schedule3);

        Train train1 = new Train("Express", "New-York", "London", schedulesOne, Boolean.TRUE);
        Train train2 = new Train("Ice", "New-York", "Dalas", schedulesTwo, Boolean.FALSE);

        List<Transport> trainList = new ArrayList<>();
        trainList.add(train1);
        trainList.add(train2);

        Station station = new StationTrain("Paradise", trainList, "Steve Simpson", Boolean.TRUE);

        System.out.println(station);


        List<Conditions> conditions = new ArrayList<>();
        conditions.add(Conditions.CLOUDY);
        conditions.add(Conditions.SUNNY);
        conditions.add(Conditions.PARTIALLY_CLOUDY);
        conditions.add(Conditions.RAIN);
        conditions.add(Conditions.SNOW);
        conditions.add(Conditions.FOG);

        Plan plan1 = new Plan("Air", "Los-Angeles", "Madrid", schedulesOne, conditions, Boolean.TRUE);
        Plan plan2 = new Plan("Cloud", "Mexico", "Chicago", schedulesTwo, conditions, Boolean.FALSE);


        List<Transport> plainList = new ArrayList<>();
        plainList.add(plan1);
        plainList.add(plan2);

        Station station2 = new StationAir("Dream", plainList, "Emily Stone", Boolean.TRUE);

        System.out.println();
        System.out.println(station2);


    }
}
