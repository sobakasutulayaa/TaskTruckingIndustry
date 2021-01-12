package taskTruckingIndustry.service;

import taskTruckingIndustry.model.RoadTransport;

public class RoutePlanningService {


    public RoadTransport.TypeOfRoadTransport selectTransportType(double weight) {
        if (weight > 0 && weight < 10) {
            return RoadTransport.TypeOfRoadTransport.LORRY;
        }
        if (weight > 0 && weight < 25) {
            return RoadTransport.TypeOfRoadTransport.AWNING_SEMI_TRAILER;
        }
        if (weight > 0 && weight < 35) {
            return RoadTransport.TypeOfRoadTransport.JUMBO;
        }
        return RoadTransport.TypeOfRoadTransport.TANK;
    }


}
