package Lesson10;

public class Car {
    public static String colorS;
    String color;
    int motor;
    int door;

    public Car(int door) {
        this.door = door;

    }
    public Car(int motor , String color){
        this.motor = motor;
        this.color = color;
    }
}
class CarTest{

   public static int doordise(Car car3 , int door){
       return car3.door = door;
    }

    public static void twomethod (Car car1 , Car car2){
       Car.colorS = car1.color;
       car1.color = car2.color;
       car2.color = Car.colorS;
    }
}
class Drive{
    public static void main(String[] args) {

        Car car1 = new Car(12 , "Red" );
        Car car2 = new Car(18 , "Black");
        Car car3 = new Car(3);

        CarTest.twomethod(car1 , car2);

        System.out.println("первая машина" + " " + " " + car1.motor + " " + car1.color);
        System.out.println("Вторая машина" +  " " + " " + car2.motor + " " + car2.color);
        System.out.println(" ");
        System.out.println("Количество дверей" + " " + CarTest.doordise( car3 , 4));

    }

}