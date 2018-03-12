import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

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

    public static void destroyInteger() {
        try {
            Class<?> clazz = Class.forName("java.lang.Integer$IntegerCache");
            Field field = clazz.getDeclaredField("cache");
            field.setAccessible(true);
            Integer[] cache = (Integer[]) field.get(clazz);
            for (int i = 0; i < cache.length; i++) {
                cache[i] = new Integer(new Random().nextInt(cache.length));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
