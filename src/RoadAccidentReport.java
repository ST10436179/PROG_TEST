

public class RoadAccidentReport extends RoadAccidents {


    public RoadAccidentReport(String vehicleType, String cityAccident, int totalNumAccidents) {
        super(vehicleType, cityAccident, totalNumAccidents);
    }

    public void printAccidentReport(){
        System.out.println("VEHICLE ACCIDENT REPORT");
        System.out.println("*************************");
        System.out.println("VEHICLE TYPE:  " + getVehicleType());
        System.out.println("CITY:  " +getCity());
        System.out.println("ACCIDENT TOTAL:  " + getAccidentTotal());
    }


    @Override
    public String getAccidentVehicleType() {
        return vehicleType;
    }

    @Override
    public String getCity() {
        return cityAccident;
    }

    @Override
    public int getAccidentTotal() {
        return totalNumAccidents;
    }
}
