package strategy;

public class Route {

    private String routeDescription;

    public Route(String routeDescription) {
        this.routeDescription = routeDescription;
    }

    public String getRouteDescription() {
        return routeDescription;
    }

    @Override
    public String toString() {
        return getRouteDescription();
    }
}
