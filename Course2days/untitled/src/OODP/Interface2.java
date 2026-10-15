package OODP;

import java.util.concurrent.CountedCompleter;

interface Computer{
    void runs();
}
class Laptop implements Computer{
    @Override
    public void runs() {
        System.out.println("Running in a computer");
    }
}
class Desktop implements Computer{
    @Override
    public void runs(){
        System.out.println("Running in a desktop");
    }
}
class Developer{
    public void runs(Computer obj){
        obj.runs();
    }
}
public class Interface2 {
    public static void main(String[] args) {
        Computer lap=new Laptop();
        Computer desk = new Desktop();
        Developer siru=new Developer();
        siru.runs(desk);
    }
}
