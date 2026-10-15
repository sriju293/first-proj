package Others;

sealed class ABC permits DEF,GHI{
    void show(){
        System.out.println("Hey");
    }
}
final class DEF extends ABC {
    void show(){
        System.out.println("Hello");
    }
}
sealed class GHI extends ABC permits JKL{
    void config(){
        System.out.println("Rubix");
    }
}
final class JKL extends GHI{
    void config(){
        System.out.println("OMG");
    }
}

public class Sealedclas {
    public static void main(String[] args) {
        ABC obj = new ABC();
        DEF obj1= new DEF();
        GHI obj2= new GHI();
        JKL obj3=new JKL();
        obj.show();
        obj1.show();
        obj2.show();
        obj3.show();
    }
}
