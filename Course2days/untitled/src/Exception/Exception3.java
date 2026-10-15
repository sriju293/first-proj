package Exception;

class NewClass{
    public void show() throws ClassNotFoundException{
        Class.forName("Calendr");
    }
}

public class Exception3 {
    public static void main(String[] args) {
        NewClass obj=new NewClass();
        try{
            obj.show();
        }catch (ClassNotFoundException e){
            System.out.println("Something went wrong");
            e.getStackTrace();
        }
    }
}
