package fr.univ_amu.iut.exercice1;

public class HelloWorld {
    public static String hello(String s) {
        if (s != null && s.equals("Alice"))
                return "Hello, Alice!";
        else if ( s != null && s.equals("Bob") )
                return "Hello, Bob!";
        else
                return "Hello, World!";
    }
}
