package taskTruckingIndustry.model;

public class Road {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;
    private String nameRoad;
    private int dlinna;
    private String quaality;
    private int cityBegin;
    private int cityEnd;

    public Road() {

    }

    public Road(String nameRoad, int dlinna, String quaality, int cityBegin, int cityEnd) {
        this.nameRoad = nameRoad;
        this.dlinna = dlinna;
        this.quaality = quaality;
        this.cityBegin = cityBegin;
        this.cityEnd = cityEnd;
    }


    public int getCityBegin() {
        return cityBegin;
    }

    public void setCityBegin(int cityBegin) {
        this.cityBegin = cityBegin;
    }

    public int getCityEnd() {
        return cityEnd;
    }

    public void setCityEnd(int cityEnd) {
        this.cityEnd = cityEnd;
    }

    public int getDlinna() {
        return dlinna;
    }

    public String getQuaality() {
        return quaality;
    }

    public void setDlinna(int dlinna) {
        this.dlinna = dlinna;
    }

    public void setQuaality(String quaality) {
        this.quaality = quaality;
    }

    public String getNameRoad() {
        return nameRoad;
    }

    public void setNameRoad(String nameRoad) {
        this.nameRoad = nameRoad;
    }

    public String toString() {
        return nameRoad;
    }
}
