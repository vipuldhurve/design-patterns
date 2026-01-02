package singleton.breakingSingleton;

import singleton.Scrabble;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

public class BreakSingleton {

    private final static String SCRABBLE_FILE_NAME = "scrabbleSingleton.ser";

    public static void main(String[] args) throws CloneNotSupportedException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {

        Scrabble scrabble = Scrabble.getInstance();
        System.out.println("Scrabble Singleton Instance: " + scrabble.hashCode());

        /* ------------ 1. Breaking singleton from clone()
        If singleton extends a class that implements Cloneable interface

        In our case singleton class Scrabble
        extends MySingletonClone class which implements Cloneable interface
        */
        Scrabble scrabbleClone = (Scrabble) scrabble.clone();
        System.out.println("1. Cloned instance: " + scrabbleClone.hashCode());


        // ------------ 2. Breaking singleton by using Reflections
        Scrabble scrabbleReflection = null;
        Constructor[] constructors = Scrabble.class.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            constructor.setAccessible(true);
            scrabbleReflection = (Scrabble) constructor.newInstance();
        }

        if (Objects.nonNull(scrabbleReflection)) {
            System.out.println("2. Reflection instance: " + scrabbleReflection.hashCode());
        }


        /* ------------ 3. Breaking singleton by Serialization & Deserialization
        - Serialize singleton object to a file
        - Deserialize singleton object from the file
        */
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream(SCRABBLE_FILE_NAME));
        out.writeObject(scrabble);
        out.close();

        ObjectInput in = new ObjectInputStream(new FileInputStream(SCRABBLE_FILE_NAME));
        Scrabble serializedScrabble = (Scrabble) in.readObject();
        in.close();

        System.out.println("3. Serialized instance: " + serializedScrabble.hashCode());
    }

}
