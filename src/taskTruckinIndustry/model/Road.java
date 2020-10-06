package taskTruckinIndustry.model;

public class Road {
    private double lengthOfRoad;
    private double qualityOfRoad;

    public Road(double lengthOfRoad, double qualityOfRoad) {
        this.lengthOfRoad = lengthOfRoad;
        this.qualityOfRoad = qualityOfRoad;
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
}