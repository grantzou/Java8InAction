package mycorejava;

import static java.lang.System.out;

public class IntegerTricks {

    public static void main(String... args) {
        int i1 = 1;
        Integer io = new Integer(i1);
        // line n1
        Integer ib1 = i1;
        Integer ib2 = 1;

        out.println((i1 == io) + " " + (ib1 == ib2));
    }
}
