package OODP;

class D{
    D(){
        System.out.println("in OODP.A");
    }
    D(int m){
        System.out.println("M :"+m);
    }
    void show(){
        System.out.println("OODP.A show");
    }
}
class B extends D{
    B(){
        System.out.println("in OODP.B");
    }
    B(int n){
        this();

        System.out.println("N "+n);
    }
    void show(){
        System.out.println("In OODP.B show");
    }
}

public class Inher {
    public static void main(String[] args) {
        B obj=new B(10);
        obj.show();
    }
}


//public class OODP.Inher {
//    public static void main(String[] args) {
//        Calc c=new Calc(20,10);
//        System.out.println(c.add());
//        System.out.println(c.sub());
//    }
//}
