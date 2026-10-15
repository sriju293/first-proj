package Threadss;

class Hi extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("HI");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Hello extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("HELLO");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Pg1 {
    public static void main(String[] args) {
        Hi obj=new Hi();
        Hello obj1=new Hello();
        obj.setPriority(Thread.MAX_PRIORITY);
        obj1.setPriority(9);
        System.out.println(obj.getPriority());
        System.out.println(obj1.getPriority());
        obj.start();
        obj1.start();
//        obj.show();
//        obj1.show();
    }
}
