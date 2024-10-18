package Lesson20;

import static Lesson20.Abc.abc;

public class TestAbc {

    public static void main(String[] args) {
        String[][] ar = abc(args, args, args, args);
        for (int i = 0; i < ar.length; i++) {
            ar[i] = null;
        }
        for (String[] a : ar) {
            System.out.println(a);


        }
    }
}
