package singleton.breakingSingleton;

import singleton.MySingletonClone;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Objects;

public class ScrabbleFix extends MySingletonClone implements Serializable {
    //Eager initialization
    //private static ScrabbleBreakFix scrabble = new ScrabbleBreakFix();

    //Lazy initialization : if instance is required then only it is created
    private static ScrabbleFix scrabble = null;

    private static final String[] scrabbleLetters = {"A", "A", "A", "A", "A", "A", "A",
            "A", "A", "B", "B", "C", "C", "D", "D", "D", "D", "E", "E", "E", "E", "E",
            "E", "E", "E", "E", "E", "E", "E", "F", "F", "G", "G", "G", "H", "H", "I",
            "I", "I", "I", "I", "I", "I", "I", "I", "J", "K", "L", "L", "L", "L", "M",
            "M", "N", "N", "N", "N", "N", "N", "O", "O", "O", "O", "O", "O", "O", "O",
            "P", "P", "Q", "R", "R", "R", "R", "R", "R", "S", "S", "S", "S", "T", "T",
            "T", "T", "T", "T", "U", "U", "U", "U", "V", "V", "W", "W", "X", "Y", "Y",
            "Z", "", ""};
    private final LinkedList<String> letters = new LinkedList<>(Arrays.asList(scrabbleLetters));

    private static boolean firstThread = true;

    // Reflections fix
    private ScrabbleFix() {
        if (Objects.nonNull(scrabble)) {
            throw new IllegalStateException("Constructor instantiation not allowed for " + this.getClass().getName());
        }
    }

    // Serialization fix
    protected Object readResolve(){
        return scrabble;
    }

    // Clone fix
    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    public static ScrabbleFix getInstance() {
        if (scrabble == null) {
            if (firstThread) {
                firstThread = false;
                Thread.currentThread();
                try {
                    Thread.sleep(1000); // First Thread sleeping
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            //Thread safe singleton using synchronized block
            synchronized (ScrabbleFix.class) {
                if (scrabble == null) {
                    scrabble = new ScrabbleFix();
                    Collections.shuffle(scrabble.letters);
                }
            }

        }
        return scrabble;
    }

    public LinkedList<String> getLetters() {
        return scrabble.letters;
    }

    public LinkedList<String> getTiles(int howManyTiles) {
        LinkedList<String> tilesToSend = new LinkedList<>();
        for (int i = 0; i < howManyTiles; i++) {
            tilesToSend.add(letters.remove(0));
        }
        return tilesToSend;
    }

}
