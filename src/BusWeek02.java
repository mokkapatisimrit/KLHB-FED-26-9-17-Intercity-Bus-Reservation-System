public class BusWeek02 {
    static boolean validToken(String token) {
        return token.matches("[A-Z]+-[0-9]{2}");
    }

    static boolean validSeat(String seat) {
        return seat.matches("S-0[1-6]");
    }

    public static void main(String[] args) {
        String token = "ORBIT-07";
        String seat = "S-02";
        boolean tokenValid = validToken(token);
        boolean seatValid = validSeat(seat);
        System.out.println("Request token valid: " + tokenValid);
        System.out.println("Seat label valid: " + seatValid);
        System.out.println("Request ready: " + (tokenValid && seatValid));
    }
}
