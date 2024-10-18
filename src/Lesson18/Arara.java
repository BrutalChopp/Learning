package Lesson18;

import java.util.Arrays;

public class Arara {

    public static void sortirovka(int[] oblaco) {
        int[] source = oblaco;
        int[] destination = new int[source.length];
        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i];
        }
            Arrays.sort(destination);

        for(int j = 0 ; j < destination.length; j++){
            System.out.println(destination[j]);
        }


    }

}
