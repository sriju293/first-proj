package Threadss;

interface V{
    public void func();
}
class SomeNew implements Runnable,V{
    @Override
    public void run() {
        for(int i=0;i<10;i++) {
            System.out.println("HII");
        }
    }

    @Override
    public void func() {
        System.out.println("OOOH");
    }
}

class SomethingNew implements Runnable,V{
    @Override
    public void run() {
        for(int i=0;i<10;i++) {
            System.out.println("HELLO");
        }
    }

    @Override
    public void func() {
        System.out.println("UFFFFFFF");
    }
}

public class Pg2 {
    public static void main(String[] args) {
        Runnable obj=new SomeNew();
        Runnable obj2=new SomethingNew();
        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj2);

        t1.start();
        t2.start();
    }
}
