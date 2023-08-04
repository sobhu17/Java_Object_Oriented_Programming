package Constructors;

public class CustomConstructor {
    private int id;
    String name;
    String batch;
    private int psp;

    public CustomConstructor(int id , String name , String batch , int psp){
        this.id = id;
        this.name = name;
        this.batch = batch;
        this.psp = psp;
    }

    public void printStudent(){
        System.out.println(this.id + " | " + this.name + " | " + this.batch + " | " + this.psp + " | ");
    }
}
