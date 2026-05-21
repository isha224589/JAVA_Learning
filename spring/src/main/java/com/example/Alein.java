package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class Computer {
    public void compile() {
        System.out.println("Compiling...");
    }
}

@Component
public class Alein {

    private int age;
    @Autowired
    private Computer com;

    public int getAge(){
        return age;
    }
    public int setAge(int age){
        this.age =age;
    }
    
    public Computer getCom(){
        return com;
    }
    public void setCom(Computer com){
        this.com;
    }


    public void code(){
        com.compile();
    }




    // public Alein(){
    //     System.out.println("Object Created");
    // }
    // public  void code(){
    //     int arr[]={1,2,3,4};
    //     for (int i =0; i<arr.length;i=i+2){
    //         System.out.println(arr[i]+" ");
    //     }
    // }
}
