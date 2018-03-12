import java.time.Duration;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        // -XX:SelfDestructTimer=1
        LocalTime startTime = LocalTime.now();
        while (true) {
            System.out.println("Up " + Duration.between(startTime, LocalTime.now()).getSeconds() + " s");
            $.sleep(2_000);
        }
    }

}
