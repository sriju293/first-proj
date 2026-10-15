package OODP;

class R{
    int age;
    public void show(){
        System.out.println("Show");
    }
    class U{
        public void config(){
            System.out.println("Config");
        }
    }
    static class Z{
        public void config(){
            System.out.println("Z config");
        }
    }

}

class Y{
    public void show(){
        System.out.println("Y show");
    }
}

public class InncerCl {
    public static void main(String[] args) {
        R obj=new R();
        obj.show();
        R.U obj1= obj.new U(); // we need obj of A if class is not static
        R.Z obj2=new R.Z(); //static class
        obj1.config();
        obj2.config();

        //anonymous classes
        Y obj5=new Y(){
            public void show(){
                System.out.println("Y new show");
            }
        };
        obj5.show();

    }
}
