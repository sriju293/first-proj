package Exception;

public class Exception1 {
    public static void main(String[] args) {
        int i=1; //Normal stmts
        int j=0;
        int arr[]={1,2,3,5};
        String s=null;
        try {
            j = 8 / i; //Critical stmts
            System.out.println(s.length());
            System.out.println(j);
            System.out.println(arr[2]);
        }
        catch (ArithmeticException e){
            System.out.println("Maths Ufff" + e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array length is just " + arr.length + " so stick to it.");
        }
        catch (Exception e){
            System.out.println("Oooh no!! Something is wrong" + e);
        }

        System.out.println("Byee");
    }

}
