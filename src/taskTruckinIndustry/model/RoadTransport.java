package taskTruckinIndustry.model;

public class RoadTransport {
    public enum TypeOfRoadTransport {
        LORRY, // грузовой автомобиль (до 10 т)
        AWNING_SEMI_TRAILER, // тентованный полуприцеп (до 25 т)
        JUMBO, // "jumbo" - полуприцеп увеличенной вместимости, имеющий особую «Г»-образную форму пола (до 35 т)
        TANK, // цистерна - для перевозки наливных грузов (от 20 до 120 т)
    }

    //private double carryingCapacity;
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

    public TypeOfRoadTransport selectTransportType(double weight) {
        if (weight > 0 && weight < 10) {
            return TypeOfRoadTransport.LORRY;
        }
        if (weight > 0 && weight < 25) {
            return TypeOfRoadTransport.AWNING_SEMI_TRAILER;
        }
        if (weight > 0 && weight < 35) {
            return TypeOfRoadTransport.JUMBO;
        }
        return TypeOfRoadTransport.TANK;
    }
}