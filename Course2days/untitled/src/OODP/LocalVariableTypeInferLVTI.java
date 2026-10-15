package OODP;

import java.util.ArrayList;

public class LocalVariableTypeInferLVTI {
    public static void main(String[] args) {
        var obj = new ArrayList<>();
        int a = 9;
        var b = 8;
        int c = 0;

        System.out.println(a + b + c);
    }
}
