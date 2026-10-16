import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class BusWeek11 {
    public static void main(String[] args) throws IOException {
        Path file = Path.of("fixture_records.csv");
        List<String> rows = List.of(
            "route,seat,token",
            "ROUTE-A,S-01,ORBIT-07",
            "ROUTE-A,S-02,NOVA-12",
            "ROUTE-B,S-01,PIXEL-04"
        );
        Files.write(file, rows);
        List<String> loaded = Files.readAllLines(file);
        System.out.println("Fixture records written: " + (rows.size() - 1));
        System.out.println("Fixture records read: " + (loaded.size() - 1));
        System.out.println("First fixture: " + loaded.get(1));
    }
}
