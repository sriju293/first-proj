package OODP;

interface I{
    //interface methods are public and abstract by default
    //variables are final and static

    //int age; ->error
    int age=9;
    String name="Sirushti";

    void show(int age);
    void config();
}

class J implements I{

    public void show(int age) {
        System.out.println("Showing J");
    }

    public void config() {
        System.out.println("Config J");
    }
}

public class Interfac {
    public static void main(String[] args) {
        //Abstract clas no obj instantiated but interface can
        I obj;
        //I obj1=new I(); --> error
        I obj1 = new J();
        obj1.show(89);
        obj1.config();
        int age = obj1.age;
        System.out.println(age);
        System.out.println(obj1.name);
        System.out.println(I.age);
    }
}
