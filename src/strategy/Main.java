package strategy;

public class Main {

    public static void main(String[] args) {
        Navigator navigator = new Navigator();
        navigator.setRouteStrategy(new RoadStrategy());
        Route routeFirst = navigator.buildRoute(1L, 15L);
        navigator.setRouteStrategy(new PublicTransportStrategy());
        Route routeSecond  = navigator.buildRoute(1L, 10L);
        navigator.setRouteStrategy(new WalkingStrategy());
        Route routeThird  = navigator.buildRoute(1L, 5L);
        System.out.println(new StringBuilder()
                .append(routeFirst).append('\n')
                .append(routeSecond).append('\n')
                .append(routeThird));
    }
}
