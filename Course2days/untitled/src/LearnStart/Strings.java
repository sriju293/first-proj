package LearnStart;

public class Strings {
    public static void main(String[] args) {
//        String name= "Sirushti";
//        String s2="Sirushti";
//        System.out.println(name.hashCode());
//        System.out.println(s2.hashCode());
//        System.out.println(s2+"\n"+name);
//        if(s2==name){
//            System.out.println(true);
//        }
//        else{
//            System.out.println(false);
//        }
//        s2="Subha";
//        System.out.println(s2.hashCode());
//        System.out.println(s2+"\n"+name);
//        if(s2==name){
//            System.out.println(true);
//        }
//        else{
//            System.out.println(false);
//        }
        StringBuffer sb=new StringBuffer("Sirushti"); //Constant 16 spaces provided and this addnal 8 so 24
        System.out.println(sb.capacity());

        String s1=sb.toString();
        System.out.println(s1);
    }
}
