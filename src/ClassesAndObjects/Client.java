package ClassesAndObjects;

public class Client {
    public static void main(String[] args) {
        Student s1 = new Student();
//        s.id = 10; can't be initialized as id is a private varibale
//        and can be accessed only within a class or by getter and setter

        s1.name = "Saurabh Kaushik";
        s1.batch = "March-22-Intermediate";
        s1.printStudent();

        Student s2 = new Student();
        s2.name = "Kartik Sachdeva";
        s2.printStudent();
    }
}
