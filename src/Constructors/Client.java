package Constructors;

public class Client {

    public static void main(String[] args) {
        Student s1 = new Student();  // it is a default constructor
        // and is only called if we don't have our own custom constructor
        // it initializes the values of all the attributes to their default values

//        s1.name = "Saurabh Kaushik";
//        s1.printStudent();      // OUTPUT ->  0 | Saurabh Kaushik | null | 0 |

//        We can have multiple constructors in a class

        Student s3 = new Student(3 , "Lakshay Jain"); // more than one constructor in a class
        s3.printStudent();                                      // call depends on what parameters we are passing

        CustomConstructor s2 = new CustomConstructor(1 , "Habeeba Ahmed" , "March_2022_Intermediate" , 94);
        s2.printStudent();

    }
}
