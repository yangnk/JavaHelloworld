package lang;

import java.io.*;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2019-01-20 下午12:28
 **/
public class SerializeSample implements Serializable {
    private static final long serialVersionUID = 119989231699812337L;
    public int a = 0;

    public static void main(String[] args) {
        try {
            ObjectOutput objectOutput = new ObjectOutputStream(new FileOutputStream("123.dat"));
            SerializeSample serializeSample = new SerializeSample();
            objectOutput.writeObject(serializeSample);
            objectOutput.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
