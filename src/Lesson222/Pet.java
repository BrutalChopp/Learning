package Lesson222;



public class Pet extends Animal {

    private String tail;
    private String name;

    private int paw;

    public Pet() {
        System.out.println("Im a pet");
    }



    public int getPaw() {
        return paw;
    }

    public void setPaw(int paw) {
        this.paw = paw;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }




    public void run(){
        System.out.println("run");
    }


    public void jump(){
        System.out.println("jump");
    }

}
