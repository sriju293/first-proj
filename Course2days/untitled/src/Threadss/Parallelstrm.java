package Threadss;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

public class Parallelstrm {
    public static void main(String[] args) {
        int nums[]=new int[100];
        Random r=new Random();
        for(int i=0;i<100;i++){
            nums[i]=r.nextInt();
        }

        long starts=System.currentTimeMillis();
        int sum1 = Arrays.stream(nums)
                .map(i ->{
                    try{
                        Thread.sleep(1);
                    }
                    catch (Exception e){

                    }
                    return i * 2;}
                )
                .sum();
        long ends=System.currentTimeMillis();

        long startp=System.currentTimeMillis();
        int sum2=Arrays.stream(nums).parallel().map(i ->{
            try{
                Thread.sleep(1);
            }
            catch (Exception e){

            }
            return i * 2;}
        ).sum();
        long endp=System.currentTimeMillis();

        System.out.println(sum1 + " " + (ends - starts));
        System.out.println();
        System.out.println(sum2 + " " + (endp - startp));


    }
}
