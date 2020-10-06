package taskTruckinIndustry.model;

public class RoadTransport {
    private String typeOfRoadTransport;
    private double carryingCapacity;

    public RoadTransport(String typeOfRoadTransport, double carryingCapacity) {
        this.typeOfRoadTransport = typeOfRoadTransport;
        this.carryingCapacity = carryingCapacity;
    }

    public String getTypeOfRoadTransport() {
        return typeOfRoadTransport;
    }

    public void setTypeOfRoadTransport(String typeOfRoadTransport) {
        this.typeOfRoadTransport = typeOfRoadTransport;
    }

    public double getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(double carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }
}