package strategy;

public class Navigator {

    private RouteStrategy routeStrategy;

    public Route buildRoute(Long a, Long b) {
        return routeStrategy.buildRoute(a, b);
    }

    public void setRouteStrategy(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }
}
