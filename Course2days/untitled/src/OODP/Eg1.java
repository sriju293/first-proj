package OODP;
import java.util.ArrayList;
class Parent {
    int x = 10;

    void show() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    int x = 20;

    @Override
    void show() {
        System.out.println("Child");
    }
}
public class Eg1 {
    public static void main(String[] args) {
        Parent obj = new Child();

        System.out.println(obj.x);
        obj.show();

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        list.remove(1);
        list.remove(Integer.valueOf(10));
        System.out.println(list);

    }
}
