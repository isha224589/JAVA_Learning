public class Strings {
    public static void main(String[] args) {
        // String st = "Hello";
        // String str = new String("Hello");
        StringBuffer str = new StringBuffer("Hey");
        str.append("! what's your name?");
        str.insert(1, "d");
        str.delete(1, 2);
        str.reverse();
        str.replace(1, 3, "zyx");
        System.out.println(str);
        System.out.println(str.capacity());
    }
}
