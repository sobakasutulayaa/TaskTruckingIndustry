package taskTruckingIndustry.model;


public class RoadTransport {
    public enum TypeOfRoadTransport {
        LORRY, // грузовой автомобиль (до 10 т)
        AWNING_SEMI_TRAILER, // тентованный полуприцеп (до 25 т)
        JUMBO, // "jumbo" - полуприцеп увеличенной вместимости, имеющий особую «Г»-образную форму пола (до 35 т)
        TANK, // цистерна - для перевозки наливных грузов (от 20 до 120 т)
    }

    //private double carryingCapacity; // грузоподъемность
    private TypeOfRoadTransport typeOfRoadTransport;

    public RoadTransport(TypeOfRoadTransport typeOfRoadTransport) {
        //this.carryingCapacity = carryingCapacity;
        this.typeOfRoadTransport = typeOfRoadTransport;
    }

    /*
    public double getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(double carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }
     */

    public TypeOfRoadTransport getTypeOfRoadTransport() {
        return typeOfRoadTransport;
    }

    public void setTypeOfRoadTransport(TypeOfRoadTransport typeOfRoadTransport) {
        this.typeOfRoadTransport = typeOfRoadTransport;
    }
}