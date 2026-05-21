package collections;

import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<String> obj = new LinkedList<String>();
        obj.add("One");
        obj.add("Two");
        obj.add("Three");
        
        // update
        obj.set(1, "Three");
        // remove
        obj.remove(0);
        // using get(i) 
        for (int i =0;i <obj.size(); i++ ){
            System.out.println(obj.get(i)+ "");            
        }
        System.out.println();
// using for each loop
        for (String str:obj){
            System.err.print(str + " ");
        }
    }
}
