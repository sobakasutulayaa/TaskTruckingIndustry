package taskTruckingIndustry.model;

public class Transport {
    private int id;
    private String name;
    private int maxWeight;
    private int speed;
    private int City;

    public Transport() {

    }

    public Transport(String name, int maxWeight, int speed, int city) {
        this.name = name;
        this.maxWeight = maxWeight;
        this.speed = speed;
        City = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCity() {
        return City;
    }

    public void setCity(int city) {
        City = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString() {
        return name;
    }
}
