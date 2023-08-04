package AccessModifiers;

public class Client {
    public static void main(String[] args) {
        Parent p = new Parent();
//        p.id = 10;
        p.name = "Saurabh Kaushik";
        p.batach = "March-22-Intermediate";
        p.psp = 99;
        p.printParent();

        Child c = new Child();
//        c.id = 20;
        c.name = "Lakshay Jain";
        c.batach = "Feb-23-Beginner";
        c.psp = 85;
        c.printChild();

        // Decreasing strictness
        // Private -> Accessed Only in a class
        // Default -> Accessed within class and neighbours
        // Protected -> Accessed within class , neighbours and child outside neighbours i.e outside package
        // public -> Accessed from anywhere.


    }
}
