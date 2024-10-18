package Lesson222;

public class Cat extends Pet {
    private String name;


    public Cat(String name){
        System.out.println("Im a cat , my name is" + " " + name);
    }


    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }




    public void sleep() {
        System.out.println("Cats sleeps");
    }
}
