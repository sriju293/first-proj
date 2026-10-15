package LearnStart;

enum Status{
    Running,Failed,Success,Pending;
}
enum Laptop{
    Macbook(1000), XPS(1020), Surface(2003);
    private int price;

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class Enumsim {
    public static void main(String[] args) {
//        Status s[]=Status.values();
//        for (Status ss:s){
//            System.out.println(ss);
//        }

        Status s=Status.Success;
        if(s.equals(Status.Success)){
            System.out.println("Succesfull");
        }

        Laptop lap= Laptop.Macbook;
        System.out.println(lap);
    }
}
