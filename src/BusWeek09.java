class RouteState {
    private final String label;
    private final boolean active;

    RouteState(String label, boolean active) {
        this.label = label;
        this.active = active;
    }

    @Override
    public String toString() {
        return "RouteState{label='" + label + "', active=" + active + "}";
    }
}

class SeatState {
    private final String seat;
    private final String token;
    private final String state;

    SeatState(String seat, String token, String state) {
        this.seat = seat;
        this.token = token;
        this.state = state;
    }

    @Override
    public String toString() {
        return "SeatState{seat='" + seat + "', token='" + token + "', state='" + state + "'}";
    }
}

public class BusWeek09 {
    public static void main(String[] args) {
        RouteState route = new RouteState("ROUTE-A", true);
        SeatState allocation = new SeatState("S-02", "ORBIT-07", "ASSIGNED");
        System.out.println(route);
        System.out.println(allocation);
        System.out.println("Allocated state entries: 2");
    }
}
