package Lesson21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Abd {
    public static ArrayList<String> method(String... a){
        // Создаем ArrayList из массива a
        ArrayList<String> str2 = new ArrayList<>(Arrays.asList(a));
        // Сортируем ArrayList
        Collections.sort(str2);
        // Возвращаем отсортированный ArrayList
        return str2;
        }
    }

