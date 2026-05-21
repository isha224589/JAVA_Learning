package collections;

import java.util.ArrayList;
import java.util.Collections;

public class collection {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        Collections.addAll(fruits, "Mango", "Strawberry");
        fruits.remove(0);
        fruits.remove("Mango");


        // searching
        if (fruits.contains("Orange")) {
            System.out.println("Orange is present");
            
        }

        // update
        fruits.set(0,"Mango");
        // sorting
        Collections.sort(fruits);

        System.out.println("" + fruits);
    }
}
