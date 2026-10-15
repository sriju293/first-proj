package CollnApi;

import OODP.Inher;

import java.util.*;


public class Mpp {
    public static void main(String[] args) {
        Map<String,Integer> mpp= new Hashtable<>();
        mpp.put("Sirushti",499);
        mpp.put("Keerthi",500);
        mpp.put("Anitha",450);
        mpp.put("Kannan",290);
        System.out.println(mpp);
        for(String stud:mpp.keySet()){
            System.out.println(stud+" : "+mpp.get(stud));
        }
    }
}
