package patterns.creational.builder.components;

public class GPSNavigator {
    private String route;

    public GPSNavigator() {
        this.route = "Москва - Санкт-Петербург";
    }

    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute() {
        return route;
    }
}
