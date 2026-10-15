package OODP;

@FunctionalInterface
interface N{
    void show();

}

interface O{
    void someFun(int j);
}

public class Interface3 {
    public static void main(String[] args) {
        N obj1 = () -> {
            System.out.println("Somethingooo");
        };
        N obj2 = () ->  System.out.println("Somethingxxxx");
        O obj3 = i -> System.out.println("Hi "+ i);


        obj1.show();
        obj2.show();
        obj3.someFun(8);
    }
}
