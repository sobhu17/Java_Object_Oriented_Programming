package PolymorphismBasics;
import java.util.*;

public class Client {
    public static void main(String[] args) {
        User u = new User();
        User s = new Student();
        User i = new Instructor();

        ArrayList<User> arr = new ArrayList<>();
        arr.add(u);
        arr.add(s);
        arr.add(i);

        // this is what polymorphism means i.e something taking multiple forms
        // here user is having multiple forms
        // a user can be a student, Instructor and user itself.
        // so, in oop polymorphism pillar allows us to
        // represent multiple forms of something with a single name without repeating the code
    }
}
