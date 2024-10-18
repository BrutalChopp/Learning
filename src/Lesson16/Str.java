package Lesson16;


import java.util.Scanner;

public class Str {


    public static void email(String email) {
        for(int i = 0; i < email.length(); i++){
            int position1 = email.indexOf("@mail");
            int position2 = email.indexOf("@gmail");
            int position3 = email.indexOf("@yandex");

            if(position1 == i){
                System.out.println("MAIL");
            } else if (position2 == i) {
                System.out.println("GMAIL");
            } else if (position3 == i){
                System.out.println("YANDEX");
            }
        }
    }

}
class StrTest{
        public static void main(String[] args) {
            Str.email("nickotin.s@mail.ru ; sergeynikotin@gmail.ru ; sergeyoligovick043@yandex.ru");
        }

    }

