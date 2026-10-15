package OODP;

abstract class Car{
    public abstract void drive();
    public void playMusic(){
        System.out.println("Playing songs");
    }
}

abstract class Toyota extends Car{
    public abstract void drive();

    }

class BMW extends Toyota{
    public void drive() {
        System.out.println("DRIVES carefully");
    }
}

public class Abstra {
    public static void main(String[] args) {
        //Can't create obj of abstract class
        //Car obj=new Car();
        BMW obj=new BMW();
        obj.drive();
        obj.playMusic();
    }
}
