package OODP;

class Human{
    private int age;
    String name="ABC";
    static int cnt=0;
    //order is static method (only once) then constructor(every time obj created) then everything else
    Human(){
        System.out.println("Constructor");
        this.name=name;
    }
    static{
        System.out.println("in static method");
    }
    public void setAge(int age,Human obj){
        Human obj1=obj;
        obj1.age=age;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return this.name;
    }



}

public class OOPS {
    public static void main(String[] args) {
        Human obj=new Human();
        //OODP.Human obj1=new OODP.Human(); //ERROR
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
        obj.name="Sirushti";
        obj.setAge(20,obj);
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }
}
