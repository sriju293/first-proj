package CollnApi;
import java.util.*;

public class Prg1 {
    public static void main(String[] args) {
        Collection<Integer> nums = new ArrayList<>();
        int arr[]={1,2,3,4,5};

        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        System.out.println(nums);
        for (int n: nums){
            System.out.println(n);
        }
    }
}
