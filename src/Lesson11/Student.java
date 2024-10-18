package Lesson11;

public class Student {


    int numberStudentBilet;
    String name;
    String surname;
    int yearWork;
    double averageScoreInMath;
    double averageScoreInEconomics;
    double averageScoreInEnglish;
    double result;

    Student(
            int numberStudentBilet,
            String name,
            String surname,
            int yearWork,
            double averageScoreInMath,
            double averageScoreInEconomics,
            double averageScoreInEnglish) {


    }


    Student(String nameB, String surnameB, int yearWorkB) {
        this(0, nameB, surnameB, yearWorkB, 0, 0, 0);
    }

    Student() {

    }


}

class StudentTest {

    public static boolean methodeq(Student s1, Student s2) {
        boolean result;
        if (s1.equals(s2)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }


    public static boolean methodaq(Student st1, Student st2) {
        boolean result;

        if(st1.name == st2.name) {
            result = true;
            System.out.println("Студенты равны Имя");
            if(st1.surname == st2.surname) {
                result = true;
                System.out.println("Студенты равны Фамилия");
                if(st1.averageScoreInEconomics == st1.averageScoreInEconomics) {
                    result = true;
                    System.out.println("Студенты равны Экономика");
                } else {
                    result = false;
                    System.out.println("Студенты равны Экономика");
                }
            } else {
                result = false;
                System.out.println("Студенты не равны Фамилия");
            }
        } else {
            result = false;
            System.out.println("Студенты не равны Имя");
        }
        return result;
    }



        public static void main (String[]args){
            Student student1 = new Student();
            Student student2 = new Student();
            Student student3 = new Student();

            student1.name = "Артем";
            student2.name = "Петр";
            student3.name = "Артур";

            student1.surname = "Павлович";
            student2.surname = "Евгеньевич";
            student3.surname = "Арутонянович";


            student1.averageScoreInMath = 3.45;
            student2.averageScoreInMath = 5;
            student3.averageScoreInMath = 4;

            student1.averageScoreInEconomics = 3.4;
            student2.averageScoreInEconomics = 1.22;
            student3.averageScoreInEconomics = 3;

            student1.averageScoreInEnglish = 2;
            student2.averageScoreInEnglish = 3;
            student3.averageScoreInEnglish = 5;

            student1.numberStudentBilet = 123123;
            student2.numberStudentBilet = 123123;
            student3.numberStudentBilet = 345345;

            student1.yearWork = 2574527;
            student2.yearWork = 2547658;
            student3.yearWork = 3453445;

            student1.result = (student1.averageScoreInMath +
                    student1.averageScoreInEconomics +
                    student1.averageScoreInEnglish) / 3;

            student2.result = (student2.averageScoreInMath +
                    student2.averageScoreInEconomics +
                    student2.averageScoreInEnglish) / 3;

            student3.result = (student3.averageScoreInMath +
                    student3.averageScoreInEconomics +
                    student3.averageScoreInEnglish) / 3;

            System.out.println(methodeq(student1, student2));
            System.out.println(methodaq(student1, student2));


            System.out.println("Ср.Ар для " + student1.name + "  -  " + student1.result);
            System.out.println("Ср.Ар для " + student2.name + "  -  " + student2.result);
            System.out.println("Ср.Ар для " + student3.name + "  -  " + student3.result);
        }


    }

