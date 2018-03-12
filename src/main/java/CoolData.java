import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CoolData extends Data {

    public CoolData(final String name) {
        super(name);
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.writeInt(getCount());
        out.writeObject("Cool " + getName());
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        setCount(in.readInt());
        setName((String) in.readObject());
    }
}
