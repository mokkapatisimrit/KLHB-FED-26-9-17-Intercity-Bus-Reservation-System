public class BusWeek05 {
    static boolean isValidSeat(String seat) {
        return seat.matches("S-0[1-6]");
    }

    static int countAvailable(boolean[] assigned) {
        int available = 0;
        for (boolean seatAssigned : assigned) {
            if (!seatAssigned) available++;
        }
        return available;
    }

    public static void main(String[] args) {
        boolean[] assigned = {true, false, false, false, false, false};
        String checked = "S-03";
        System.out.println("Checked seat: " + checked);
        System.out.println("Seat valid: " + isValidSeat(checked));
        System.out.println("Available count: " + countAvailable(assigned));
    }
}
