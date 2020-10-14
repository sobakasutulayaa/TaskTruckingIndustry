package taskTruckingIndustry.model;

public class Road {
    private double lengthOfRoad;
    private double qualityOfRoad;
    private String cityOfDeparture;
    private String arrivalCity;

    public Road(double lengthOfRoad, double qualityOfRoad, String cityOfDeparture, String arrivalCity) {
        this.lengthOfRoad = lengthOfRoad;
        this.qualityOfRoad = qualityOfRoad;
        this.cityOfDeparture = cityOfDeparture;
        this.arrivalCity = arrivalCity;
    }

    public double getLengthOfRoad() {
        return lengthOfRoad;
    }

    public void setLengthOfRoad(double lengthOfRoad) {
        this.lengthOfRoad = lengthOfRoad;
    }

    public double getQualityOfRoad() {
        return qualityOfRoad;
    }

    public void setQualityOfRoad(double qualityOfRoad) {
        this.qualityOfRoad = qualityOfRoad;
    }

    public String getCityOfDeparture() {
        return cityOfDeparture;
    }

    public void setCityOfDeparture(String cityOfDeparture) {
        this.cityOfDeparture = cityOfDeparture;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }

    public double calculateTimeSpentOnRoad(double vehicleSpeed) {
        return lengthOfRoad * qualityOfRoad / vehicleSpeed;
    }

}