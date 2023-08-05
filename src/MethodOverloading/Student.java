package MethodOverloading;

public class Student {

    public void print(){
        System.out.println("I am a Student!!");
    }

    public void print(String st){
        System.out.println(st + " is a Student!!");
    }

    public int print(int val){
        System.out.println("I am a student plus I have some money that is " + val);
        return val + 20;
    }

}
