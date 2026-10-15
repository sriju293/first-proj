package CollnApi;

import java.util.*;

public class Lst {
    public static void main(String[] args) {

        Set<Integer> st=new TreeSet<>();
        Iterator<Integer> val=  st.iterator();
        while(val.hasNext()){
            System.out.println(val.next());
        }
        st.add(40);
        st.add(20);
        st.add(10);
        st.add(10);
        for(int x:st){
            System.out.println(x);
        }


    }
}
