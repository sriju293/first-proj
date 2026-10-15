package OODP;


class E{
    public void show(){
        System.out.println("E");
    }
}

class F extends E{
    public void show(){
        System.out.println("F");
    }
}
class G extends E{
    public void show(){
        System.out.println("G");
    }
}

public class DynamicMethodDisp {
    public static void main(String[] args) {
        //F obj = new E(); --> error
        E obj = new E();
        obj.show();
        obj=new F();
        obj.show();
        obj=new G();
        obj.show();
    }
}
