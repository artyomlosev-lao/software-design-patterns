package strategy;

public class WalkingStrategy implements RouteStrategy{

    @Override
    public Route buildRoute(Long a, Long b) {
        return new Route("WalkingStrategy: Медленно, бесплатно, дискомфортно пройдено " + (b-a) + "км");
    }
}
