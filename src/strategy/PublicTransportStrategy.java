package strategy;

public class PublicTransportStrategy implements RouteStrategy{

    @Override
    public Route buildRoute(Long a, Long b) {
        return new Route("PublicTransportStrategy: Медленно, дёшево, комфортно пройдено " + (b-a) + "км");
    }
}
