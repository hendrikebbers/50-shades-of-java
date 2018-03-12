import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
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

    public static void killOut() {
        System.setOut(new PrintStream(new OutputStream() {
            @Override
            public void write(final int b) throws IOException {

            }
        }));
    }

    public static void killErr() {
        System.setErr(new PrintStream(new OutputStream() {
            @Override
            public void write(final int b) throws IOException {

            }
        }));
    }

}
