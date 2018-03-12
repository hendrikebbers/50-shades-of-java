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
}
