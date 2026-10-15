package LearnStart;

class Student{
    int rollno;
    String name;
    int marks;
}

public class Hello {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.marks=45;
        s1.rollno=34;
        s1.name="Rohit";

        Student s2=new Student();
        s2.marks=97;
        s2.rollno=23;
        s2.name="Navin";

        Student s3=new Student();
        s3.marks=80;
        s3.rollno=78;
        s3.name="Boo";

        Student studs[]=new Student[3];
        studs[0]=s1;
        studs[1]=s2;
        studs[2]=s3;

        for(int i=0;i< studs.length;i++){
            System.out.println(studs[i].name+" : "+studs[i].marks);
        }
        for(Student stud:studs){
            System.out.println(stud.name+" : "+stud.marks);
        }
    }
}