package Lesson13;

public class Time {
    public static void showTime() {
        OUTER: for(int i = 0; i < 6; ++i) {
            OUTERINNER:
            for (int j = 0; j < 60; ++j) {
                INNER:
                for (int k = 0; k < 60; ++k) {
                    if(i > 1 && j % 10 == 0) {
                        break OUTER;
                    }
                    System.out.println(String.format("Hour: %d, minute: %d, seconds: %d", i, j, k));
                }
            }
        }
    }
    }

    class TimeTest {
        public static void main(String[] args) {
            Time.showTime();
        }
    }
