abstract class RoadAccidents implements IRoadAccidents {
    String vehicleType;
    String cityAccident;
    int totalNumAccidents;

    public RoadAccidents(String vehicleType, String cityAccident, int totalNumAccidents) {
        this.vehicleType = vehicleType;
        this.cityAccident = cityAccident;
        this.totalNumAccidents = totalNumAccidents;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getCityAccident() {
        return cityAccident;
    }

    public int getTotalNumAccidents() {
        return totalNumAccidents;
    }
}
