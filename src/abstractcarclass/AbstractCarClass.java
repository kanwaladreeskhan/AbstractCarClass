package abstractcarclass;
public class AbstractCarClass {
    public static void main(String[] args) {
         Car c1=new ManualCar("Red","2024");
         Car c2=new AutomaticCar("Black","2020");
         System.out.println("====Car 1====");
         c1.drive();
         c1.changeGear();
         System.out.println("====Car 2====");
         c2.drive();
         c2.changeGear();
    }
 }
