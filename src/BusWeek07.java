import java.util.HashSet;
import java.util.Set;

public class BusWeek07 {
    static boolean allocate(Set<String> allocations, String seat) {
        return seat.matches("S-0[1-6]") && allocations.add(seat);
    }

    public static void main(String[] args) {
        Set<String> allocations = new HashSet<>();
        allocate(allocations, "S-01");
        allocate(allocations, "S-02");
        boolean duplicatePrevented = !allocate(allocations, "S-02");
        boolean unknownRejected = !allocate(allocations, "S-99");
        System.out.println("Duplicate allocation prevented: " + duplicatePrevented);
        System.out.println("Unknown seat rejected: " + unknownRejected);
        System.out.println("State unchanged: " + allocations.size() + " allocations.");
    }
}
