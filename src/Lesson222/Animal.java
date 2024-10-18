package Lesson222;

public class Animal {

    protected int eyes;


   public Animal(){
        System.out.println("i am animal");
    }

    public void eat(){
        System.out.println("Animal eat");
    }

    public void drink(){
        System.out.println("Animal drink");
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }
}
