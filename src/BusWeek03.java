public class BusWeek03 {
    public static void main(String[] args) {
        String seat = "S-02";
        boolean available = true;
        String decision = available ? "ACCEPTED" : "REJECTED";
        System.out.println("Seat " + seat + " state: " + (available ? "AVAILABLE" : "ASSIGNED"));
        System.out.println("Proposed allocation: " + decision);
        System.out.println("Remaining open seats: " + (available ? 5 : 6));
    }
}
