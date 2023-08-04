package AccessModifiersProtected;

import AccessModifiers.Parent;

public class Child2 extends Parent {
    public void printProtected(){
        System.out.println(this.psp);
        System.out.println(this.batach);
    }
}
