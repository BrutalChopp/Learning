package Lesson22;



public class StudentTests {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Ivan");
        Student st = new Student(sb , 20 , 18);
        String ser = "Sergey";

        st.setName(new StringBuilder(ser));
        st.setCourse(5);
        st.setGrade(7);

        st.showInfo();


    }
}
