package AccessModifiers;

public class Parent {
    private int id; // private access modifier
    String name; // default access modifier
    protected String batach; // protected access modifier
    public int psp; // public access modifier

    public void printParent(){
        System.out.println(this.id + " | " + this.name + " | " + this.batach + " | " + this.psp);
    }

}
