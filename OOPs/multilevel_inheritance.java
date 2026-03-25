package OOPs;
class Grandfather{
    String old = "I am mohan's dad";
}
class father extends Grandfather{
    String position = "I am raju's dad";
}
class son extends father{
    String role = "I am mohan's son";
}
public class multilevel_inheritance {
    public static void main(String[] args) {
        
        son obj = new son();
        System.out.println(obj.position +". "+ obj.role +". "+ obj.old);
    }
    
}
