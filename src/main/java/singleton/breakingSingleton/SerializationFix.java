package singleton.breakingSingleton;

import java.io.*;

public class SerializationFix {
    private final static String SCRABBLE_FILE_NAME = "scrabbleSingleton.ser";

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ScrabbleFix scrabble = ScrabbleFix.getInstance();
        System.out.println("Scrabble Singleton Instance: " + scrabble.hashCode());

        /* ------------ 3. Breaking singleton by Serialization & Deserialization
        - Serialize singleton object to a file
        - Deserialize singleton object from the file
        */
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream(SCRABBLE_FILE_NAME));
        out.writeObject(scrabble);
        out.close();

        ObjectInput in = new ObjectInputStream(new FileInputStream(SCRABBLE_FILE_NAME));
        ScrabbleFix serializedScrabble = (ScrabbleFix) in.readObject();
        in.close();

        System.out.println("3. Serialized instance: " + serializedScrabble.hashCode());
    }

}
