package abstractcarclass;
public class AutomaticCar extends Car{
           AutomaticCar(String color,String model){
        super(color,model);
    }
    public void changeGear(){
         System.out.println("Changing gear of Automatic car.....");
    }
    @Override
    public void drive(){
        System.out.println("Car is Driving.....");
    }
}
