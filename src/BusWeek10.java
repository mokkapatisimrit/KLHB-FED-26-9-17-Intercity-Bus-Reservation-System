class InvalidFixtureException extends Exception {
    InvalidFixtureException(String message) {
        super(message);
    }
}

public class BusWeek10 {
    static void validateSeat(String seat) throws InvalidFixtureException {
        if (!seat.matches("S-0[1-6]")) throw new InvalidFixtureException("Invalid seat label handled: " + seat);
    }

    static void validateToken(String token) throws InvalidFixtureException {
        if (token.isBlank()) throw new InvalidFixtureException("Blank request token handled.");
    }

    public static void main(String[] args) {
        try {
            validateSeat("S-99");
        } catch (InvalidFixtureException exception) {
            System.out.println(exception.getMessage());
        }
        try {
            validateToken("");
        } catch (InvalidFixtureException exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println("Simulator continues safely.");
    }
}
