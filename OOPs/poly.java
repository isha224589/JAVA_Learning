package OOPs;
// Compile time polymorphism Method overloading
// class Calculate{
//     static int multiply(int  a,int  b){
//         return a * b;
//     }
//     static double multiply(double a, double  b){
//         return a * b;
//     }
// }

// public class poly {
//     public static void main(String[] args) {
//         // Calculate obj = new Calculate();
//         System.out.println( Calculate.multiply(4, 4));
//         System.out.println(Calculate.multiply(4.18, 4.50));
//     }
// }

// Method overriding
class Parent{
    void Print(){
        System.out.println("parent class");
    }
}
class Child1 extends Parent{
    void Print(){
        System.out.println("child-1");
    }
}
class Child2 extends Parent{
    void Print(){
        System.out.println("child-2");
    }
}
public class poly{
    public static void main(String[] args) {
        Parent a;

        a = new Child1();
        a.Print();

        a = new Child2();
        a.Print();
        
    }
}
