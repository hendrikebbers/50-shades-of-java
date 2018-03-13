import java.io.Serializable;
import java.util.Objects;

public class Data implements Serializable {

    private String name;

    private int count;

    public Data(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(final int count) {
        this.count = count;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Data data = (Data) o;
        return count == data.count &&
                Objects.equals(name, data.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, count);
    }

    @Override
    public String toString() {
        return Data.class.getSimpleName() + ": " + name + ", " + count;
    }

}
