public class BusWeek08 {
    static int countOpen(boolean[] assigned, int index) {
        if (index == assigned.length) return 0;
        return (assigned[index] ? 0 : 1) + countOpen(assigned, index + 1);
    }

    public static void main(String[] args) {
        boolean[] assigned = {true, false, true, false, true, false};
        System.out.println("Recursive open-seat count: " + countOpen(assigned, 0));
        System.out.println("Fixture seats inspected: " + assigned.length);
        System.out.println("Recursion complete.");
    }
}
