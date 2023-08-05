package MathodOverriding;


public class Client {
    public static void main(String[] args) {
        User u = new Student();

        u.printUser();

        // in method overriding if both parent and child have exactly same methods
        // with same name, same arguments and same return type then the method of child class will be called
        // in order to call parent method we can use super() keyword in child class
        // it is known as runtime polymorphism
    }
}
