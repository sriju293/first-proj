//import tools.Calc;
//class Mobile{
//    String brand="HI";
//    int price=100;
//    static String name;
//
//    //static block
//    static {
//        name = "Phone";
//        System.out.println("Static block");
//    }
//    public Mobile(){
//        brand="";
//        price=150;
//        System.out.println("Default Constructor");
//    }
//    public void show(){
//        System.out.println(brand+" "+ price + " "+ name);
//    }
//    public static void show1(Mobile obj1){
//        System.out.println("Hi");
//        System.out.println(obj1.brand+" "+ obj1.price + " "+ name);
//    }
//}
//
//public class Demo {
//    public static void main(String[] args) throws ClassNotFoundException {
////        Mobile obj1=new Mobile();
////        obj1.brand="Apple";
////        obj1.price=100;
////        obj1.name="SmartPhone";
////
////        Mobile obj2=new Mobile();
//        //static block is always called when class loads
//        //OBject when created follows
//        //1) Class loads into Class Loader of JVM at tht time static method is called
//        //2) Obj is instantiated
//
//        //What if u want to load the class alone
//
//        try {
//            Class.forName("Mobile");
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//
//
//    }
//}

import java.util.Objects;

class Laptop{
    String name;
    int price;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return price == laptop.price && Objects.equals(name, laptop.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }



}

public class Demo {
    public static void main(String[] args) {
        Laptop laptop=new Laptop();
        laptop.name="Lenovo";
        laptop.price=10000;

        Laptop laptop2=new Laptop();
        laptop2.name="Lenovo";
        laptop2.price=10000;

        System.out.println(laptop2.equals(laptop));
    }
}