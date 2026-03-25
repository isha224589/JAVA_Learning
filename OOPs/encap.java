package OOPs;

class Details{
    // private  String name ="Isha";
    // private int age= 22;
    private  String name;
    private int age;

    public int getAge(){
        return  age;
    }
    public int setAge(int age){
        return this.age = age;
    }
    public String getName(){
        return name;
    }
    public String setName(String name){
        return this.name = name;
    }
}
public class encap {
    public static void main(String[] args) {
        Details obj = new Details();
        obj.setName("Isha");
        obj.setAge(23);
        System.out.println("I am "+obj.getAge()+" years old.My name is "+ obj.getName());


    }
}
