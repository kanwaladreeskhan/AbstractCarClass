package abstractcarclass;
public class ManualCar extends Car{
       ManualCar(String color,String model){
        super(color,model);
    }
       @Override
    public void changeGear(){
         System.out.println("Changing gear of manual car.....");
    }
    @Override
    public void drive(){
        System.out.println("Car is Driving.....");
    }
}
