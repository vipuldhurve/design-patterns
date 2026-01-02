package singleton.breakingSingleton;

public class CloneFix {
    public static void main(String[] args) throws CloneNotSupportedException {
        ScrabbleFix scrabble = ScrabbleFix.getInstance();
        System.out.println("Scrabble Singleton Instance: " + scrabble.hashCode());

        /* ------------ 1. Breaking singleton from clone()
        If singleton extends a class that implements Cloneable interface

        In our case singleton class Scrabble
        extends MySingletonClone class which implements Cloneable interface
        */
        ScrabbleFix scrabbleClone = (ScrabbleFix) scrabble.clone();
        System.out.println("1. Cloned instance: " + scrabbleClone.hashCode());
    }
}
