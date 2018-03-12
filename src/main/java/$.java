import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class $ {

    public static <E> List<E> list(E... elements) {
        return Collections.unmodifiableList(Arrays.asList(elements));
    }
}
