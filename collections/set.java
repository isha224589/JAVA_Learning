package collections;

import java.util.HashSet;
import java.util.Set;

public class set {
    public static void main(String[] args) {
        Set<String> s = new HashSet<String>();
        s.add("A");
        s.add("B");
        s.add("A");
        s.add("C");

        // accessing elements
        String b = "D";
        // removing
        s.remove("");
        // Iterating through the set via for-each loop
        for (String value: s)
            // System.out.println(s + b +""+ s.contains(b));
        System.out.println(value + " ");
    
    }
}
