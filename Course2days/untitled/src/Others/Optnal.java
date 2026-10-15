package Threadss;

import java.util.*;

public class Optnal {
    public static void main(String[] args) {
        List<String> lst= Arrays.asList("Sirushti","Keerthi","Anitha","Kannan");
        Optional<String> name=lst.stream().filter(str -> str.contains("i")).findFirst();

        List<String> namesWithA = lst.stream()
                .filter(str -> str.contains("a"))
                .toList(); // Java 16+ (or use .collect(Collectors.toList()))

        System.out.println(namesWithA);

        System.out.println(name.orElse("Not found"));

    }
}
