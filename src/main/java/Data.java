import java.io.Serializable;

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
    public String toString() {
        return Data.class.getSimpleName() + ": " + name + ", " + count;
    }

}
