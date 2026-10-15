package OODP;

class A{
    A(){
        System.out.println("Obj created");
    }
    void show(){
        System.out.println("Showing");
    }
}

public class OOPS2 {
    public static void main(String[] args) {
        A obj=new A();
        obj.show();
        new A().show(); //anonymous obj
        System.out.println(new A().hashCode());
        System.out.println(new A().hashCode());

    }
}
