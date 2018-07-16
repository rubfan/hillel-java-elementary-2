/**
 * @author Buger
 * @version 1.1
 * @since 1.0
 * This is main class for my <strong>Hello World</strong> app.

 */
public class Main {
    /**
     * This is my Hello World! String
     */
    private static final String hello = "Hello World!";

    /**
     * This function prints my Hello World! String
     * @param i this parameter says how many times my String will be printer
     */
    private static void printHello (int i) {
        System.out.println(hello);
    }

    /**
     * Here is entry point for my app
     * @param args command line values. Not usable
     * @throws RuntimeException this exception could be thrown
     */
    public static void main(String[] args) throws RuntimeException{
        System.out.println("Hello World!");
    }

    /**
     * * this is description with link {@link SecondClass#secondMethod()}
     * @deprecated unusable method
     * @see SecondClass#secondMethod()
     * @see "chapter 2"
     */
    private static void unusableMethod() {

    }
}
