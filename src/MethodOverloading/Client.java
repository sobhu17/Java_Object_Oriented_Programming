package MethodOverloading;

public class Client {
    public static void main(String[] args) {
        Student s = new Student();

        s.print();
        s.print("Saurabh");
        System.out.println(s.print(100000));

        // if a class have more than one method with same name,
        // but different type of arguments it is known as Method overloading
        // method that matches the argument types will get called
        // return type doesn't matter here
        // it is known as compile time polymorphism
    }
}
