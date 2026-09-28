public class BusWeek06 {
    public static void main(String[] args) {
        String[] seats = {"S-01", "S-02", "S-03", "S-04", "S-05", "S-06"};
        boolean[] assigned = {true, false, true, false, false, false};
        int open = 0;
        for (int index = 0; index < seats.length; index++) {
            String state = assigned[index] ? "ASSIGNED" : "OPEN";
            System.out.println("Seat " + seats[index] + ": " + state);
            if (!assigned[index]) open++;
        }
        System.out.println("Open seats: " + open);
    }
}
