package singleton.breakingSingleton;

import singleton.Scrabble;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

public class ReflectionFix {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        ScrabbleFix scrabble = ScrabbleFix.getInstance();
        System.out.println("Scrabble Singleton Instance: " + scrabble.hashCode());

        // ------------ 2. Breaking singleton by using Reflections
        ScrabbleFix scrabbleReflection = null;
        Constructor[] constructors = Scrabble.class.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            constructor.setAccessible(true);
            scrabbleReflection = (ScrabbleFix) constructor.newInstance();
        }

        if (Objects.nonNull(scrabbleReflection)) {
            System.out.println("2. Reflection instance: " + scrabbleReflection.hashCode());
        }
    }
}
