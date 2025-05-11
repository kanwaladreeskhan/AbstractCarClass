package abstractcarclass;
public abstract class Car {
     private String color;
     private String model;
    Car(String color,String model){
        this.color=color;
        this.model=model;
    }
    public abstract void changeGear();
    public void drive(){
        System.out.println("Car is Driving.....");
    }
}
