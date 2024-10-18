package Lesson20;

public class Abc {

        static String[][] abc(String[]... arr) {
            String[][] array = new String[arr.length][];
            for (int i = 0; i < array.length; i++) {
                array = arr;
            }
            return array;
        }


    }

