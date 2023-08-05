package ConstructorChaining;

public class Client {
    public static void main(String[] args) {
        D d = new D();   // Constructor of A is called!!
                        //  Constructor of B is called!!
                        //  Constructor of C is called!!
                        //  Constructor of D is called!!

                        // this is constructor chaining
                        // if there is no constructor without parameters
                        // then we have to call the parametrized constructor explicitly using super() keyword

    }
}
