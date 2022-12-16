package strategy;

public class RoadStrategy implements RouteStrategy {

    @Override
    public Route buildRoute(Long a, Long b) {
        return new Route("RoadStrategy: Быстро, дорого, комфортно пройдено " + (b-a) + "км");
    }
}
