package Exception;

class MyException extends Exception{
    MyException(String s){
        super(s);
    }
}

public class Exception2 {
    public static void main(String[] args) {
        int i=0;
        int j=10;
        try{
            Class.forName("Calcul");
            System.out.println("Yess");
        }
        catch(ClassNotFoundException e){
            System.out.println("Oh no");
        }
        try{
            j=18/i;
            if(j<=0){
                //throw new ArithmeticException(" Sorry i don't want to print 0");
                throw new MyException("Something");
            }
            System.out.println(j);
        }
        catch (MyException e){
            System.out.println(e.getMessage() );
        }
        catch (ArithmeticException e){
            System.out.println("Default is: "+18+" "+e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Stay within the range");
        }
        catch (Exception e){
            System.out.println("WHatever");
        }


    }
}
