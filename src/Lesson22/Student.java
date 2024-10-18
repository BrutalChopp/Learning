package Lesson22;

public class Student {
    private StringBuilder name;
    private int course;
    private int grade;

    public Student(StringBuilder name, int course, int grade) {

        this.name = name;
        this.course = course;
        this.grade = grade;
    }


    public String getName() {
        return name.toString();
    }

    public void setName(StringBuilder name) {
        this.name = name;

    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;

    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;

    }

    public void showInfo(){
        System.out.println(getName());
        System.out.println(getCourse());
        System.out.println(getGrade());
    }


}