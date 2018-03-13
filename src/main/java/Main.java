import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws Exception{
        final Data data1 = new Data("JavaLand");
        final Data data2 = new Data("JUG Dortmund");

        final Set<Data> set = new HashSet<>();
        set.add(data1);
        set.add(data2);

        data1.setCount(12);

        System.out.println("Data1: " + set.contains(data1));
        System.out.println("Data2: " + set.contains(data2));
    }

}
