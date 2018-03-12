import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class $ {

    public static <E> List<E> list(final E... elements) {
        return Collections.unmodifiableList(Arrays.asList(elements));
    }

    public static void print(final String s) {
        System.out.println(s);
    }

    public static void addShutdownHook(final Runnable r) {
        Runtime.getRuntime().addShutdownHook(new Thread(r));
    }

    public static void sleep(final long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
