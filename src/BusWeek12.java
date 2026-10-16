import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

class FixtureAllocation {
    final String route;
    final String seat;

    FixtureAllocation(String route, String seat) {
        this.route = route;
        this.seat = seat;
    }
}

public class BusWeek12 {
    public static void main(String[] args) {
        List<FixtureAllocation> allocations = new ArrayList<>();
        allocations.add(new FixtureAllocation("ROUTE-A", "S-01"));
        allocations.add(new FixtureAllocation("ROUTE-A", "S-02"));
        allocations.add(new FixtureAllocation("ROUTE-B", "S-01"));

        Map<String, Long> usage = new LinkedHashMap<>();
        allocations.stream().map(item -> item.route).forEach(route -> usage.merge(route, 1L, Long::sum));

        System.out.println("CLASSROOM ROUTE-SEAT-STATE - FINAL REPORT");
        System.out.println("Active allocations: " + allocations.size());
        System.out.println("Open seats: " + (6 - allocations.size()));
        System.out.println("Route usage: ROUTE-A=" + usage.get("ROUTE-A") + ", ROUTE-B=" + usage.get("ROUTE-B"));
        System.out.println("Status: simulation complete.");
    }
}
