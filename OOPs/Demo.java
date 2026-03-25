package OOPs;
class  Student{
    String name;
    int age;
    public Student(String name, int age){
        this.age = age;
        this.name = name;
    }
}

public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student("Riya",12 );
        System.out.println(s1.age);

    }
}