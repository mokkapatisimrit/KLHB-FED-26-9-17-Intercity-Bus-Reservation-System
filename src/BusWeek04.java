public class BusWeek04 {
    public static void main(String[] args) {
        StringBuilder labels = new StringBuilder();
        for (int number = 1; number <= 6; number++) {
            if (number > 1) labels.append(", ");
            labels.append(String.format("S-%02d", number));
        }
        System.out.println("Available seats: " + labels);
        System.out.println("Loop iterations: 6");
        System.out.println("Workflow complete.");
    }
}
