package Lesson222;

public class Dog extends Pet {

    private String name;


    public Dog(String name){
        System.out.println("Im a dog , my name is" + " " + name);
    }




@Override
    public void setName(String name) {
        this.name = name;
    }

@Override
    public String getName() {
        return name;
    }




    public void dogPlay() {
        System.out.println("Im a pet" + " " + getName());
    }



}
