package Others;

import java.util.*;

class Student{
    private String name;
    private int age;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name) {
        this.name = name;
    }
}

public class MethodRef {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Sirushti","Kirubavathi","Anitha");
        List<String> upperNames =  names.stream().map(String::toUpperCase).toList();

        //forEach
        upperNames.forEach(System.out::println);

        List<Student> studs = new ArrayList<>();
//        for(String name: names){
//            studs.add(new Student(name));
//        }

        //studs=names.stream().map(name -> new Student(name)).toList();

        studs= (List<Student>) names.stream().map(Student::new);
        System.out.println(studs);
    }
}
