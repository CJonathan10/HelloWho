package edu.virginia.cs.intro;

/**
 * Command line arguments: a name
 *
 * Example:
 * John
 */
public class HelloWho {
    public static void main(String[] args) {
        String who = args[0];
        System.out.println("Hellooooo, " + who);
    }
}
