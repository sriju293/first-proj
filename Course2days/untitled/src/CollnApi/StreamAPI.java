package CollnApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;


public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> lst= Arrays.asList(1,2,3,12,16,7,0,19);
        Stream<Integer> s1 = lst.stream();
        Stream<Integer> s2 =s1.filter(n->n%2==0);
        Stream<Integer> s3=s2.map(n-> n*2);

        int res= s3.reduce(0,(c,e)->c+e);
        System.out.println(res);

        int ans=lst.stream().filter(n-> n%2!=0).map(n-> n*3).reduce(0,(c,e)->c+e);

        System.out.println(ans);

        System.out.println();

//        s3.forEach(n-> System.out.println(n));

        System.out.println(lst);
        int sum1=0;
        for(int n:lst){
            if(n%2==0){
                n*=2;
                sum1+=n;
            }
        }
        System.out.println(sum1);
    }
}
