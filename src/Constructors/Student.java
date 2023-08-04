package Constructors;

public class Student {
    private int id;
    String name;
    String batch;
    private int psp;


    public Student(){

    }

    public  Student(int id , String name){
        this.id = id;
        this.name = name;
    }

    public void printStudent(){
        System.out.println(this.id + " | " + this.name + " | " + this.batch + " | " + this.psp + " | ");
    }
}
