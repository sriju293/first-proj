package CollnApi;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
    int age;
    String name;

    Student(int age, String name){
        this.age=age;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

class Students implements Comparable<Students> {
    int age;
    String name;

    Students(int age, String name){
        this.age=age;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Students{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Students o) {
        if(this.age > o.age) return 1;
        return -1;
    }
}

public class Comp {
    public static void main(String[] args) {
        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                if(o1%10 > o2%10) return 1;
                return -1;
            }
        };
        List<Integer> nums= new ArrayList<>(10);
        nums.add(11);
        nums.add(46);
        nums.add(23);
        nums.add(14);
        System.out.println(nums);
        Collections.sort(nums.com);
        System.out.println(nums);

        List<Student> studs=new ArrayList<>();
        studs.add(new Student(20,"Sakshi"));
        studs.add(new Student(10,"Riya"));
        studs.add(new Student(40,"Mona"));
        studs.add(new Student(15,"Diya"));

        for (Student s: studs){
            System.out.println(s.toString());
        }

        System.out.println(studs);

        //sort based on age
        Comparator<Student> comm=new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.age > o2.age) return 1;
                return -1;
            }
        };
        Collections.sort(studs.comm);
        System.out.println(studs);

        List<Students> stud1=new ArrayList<>();
        stud1.add(new Students(20,"Sakshi"));
        stud1.add(new Students(10,"Riya"));
        stud1.add(new Students(40,"Mona"));
        stud1.add(new Students(15,"Diya"));

        for (Students s: stud1){
            System.out.println(s.toString());
        }

        System.out.println(studs);
        Collections.sort(stud1);


    }
}
