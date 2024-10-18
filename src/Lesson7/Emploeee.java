package Lesson7;

public class Emploeee {

    private int slary;
    public String name;
    int id; ;

   private Emploeee(int a , String b, int c){
      slary = a;
      name = b;
      id = c;
    }


    public Emploeee(int a , String b3){
        this( a, b3,0);
    }

    Emploeee(String b2 ,int c2){
        this(0, b2 , c2);
    }

    public void meet1(){
        System.out.println(slary);
        System.out.println(name);
        System.out.println(id);
    }

    public void meet2(){
        System.out.println(slary);
        System.out.println(name);
        System.out.println(id);
    }

    public void meet3(){
        System.out.println(slary);
        System.out.println(name);
        System.out.println(id);
    }


}
