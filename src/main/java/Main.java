import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) throws Exception{
        final CoolData data = new CoolData("Hello World");
        data.setCount(12);

        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);

        objectOutputStream.writeObject(data);
        final byte[] bytes = byteArrayOutputStream.toByteArray();
        final String dataString = new String(bytes);
        System.out.println(dataString);

        final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        final ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        final Object reconverted = objectInputStream.readObject();
        System.out.println(reconverted.toString());
    }

}
