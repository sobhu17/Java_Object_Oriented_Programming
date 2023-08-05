package MathodOverriding;

public class Student extends User {

    public void printUser(){
        System.out.println("I am a Student!!!");

        super.printUser();
    }
}
