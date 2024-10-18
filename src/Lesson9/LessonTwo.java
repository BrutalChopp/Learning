package Lesson9;



public class LessonTwo {

    static final double pi = 3.14;

    double ownpl(double radius){
        double pl = Lesson9.metod1((int) pi, (int) radius, (int)radius);
        System.out.println(pl);
        return pl;
    }

    static double dlinnaokr(double radius){
        double pl = 2 * pi * radius;
        double result = Lesson9.metod2((int)pl , (int)pi);
        System.out.println(result);
        return result;
    }
}

