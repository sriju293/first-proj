package OODP;

class S{
    public void show1(){
        System.out.println("S");
    }

}
class T extends S{
    public void show2(){
        System.out.println("T");
    }
}

public class DownUpCast {
    public static void main(String[] args) {
        S s=(S)new T();
        s.show1();

        T t= (T) s;
        t.show2();
    }
}
