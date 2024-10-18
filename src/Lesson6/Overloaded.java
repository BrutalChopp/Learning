package Lesson6;

public class Overloaded {
    int one(int one) {
        return one;
    }

    int two(int one, int two) {
        int sum = one + two;
        return sum;
    }

    int three(int one, int two, int three) {
        int sum = one + two + three;
        return sum;
    }

    int four(int one, int two, int three, int four) {
        int sum = one + two + three + four;
        return sum;
    }
}
    class OverTest {

        public static void main(String[] args) {
        Overloaded one = new Overloaded();

        System.out.println(one.one(0));
        System.out.println(one.two(1,2));
        System.out.println(one.three(1,2,3));
        System.out.println(one.four(1,2,3,4));
        }

    }
