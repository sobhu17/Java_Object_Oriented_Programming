package PolymorphismWithMethodCalls;


public class Client {
    public static void main(String[] args) {
        User u = new Student();

//        u.printUser(); it will not work because user can do only user specific thins
                        // at compile time compiler only knows about the data type i.e User not Student object
                        // thats why user try to search method in User class not in Student class.

        // if we have method in User then only we can call it this way, even if it is not present in Student

        u.printUser();


    }
}
