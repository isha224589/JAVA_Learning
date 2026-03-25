public class Strings {
    public static void main(String[] args) {
        // String st = "Hello";
        // String str = new String("Hello");
        StringBuffer str = new StringBuffer("Hey");
        StringBuilder s1 = new StringBuilder("Learn String builder");
        s1.append("uses");
        str.append("! what's your name?");
        str.insert(1, "d");
        str.delete(1, 2);
        str.reverse();
        str.replace(1, 3, "zyx");
        System.out.println(str);
        System.out.println(str.capacity());
        System.out.println(s1.capacity());
        System.out.println(s1);
    }
}
