//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutt
package com.first;
/* Method overridden
-> It is similar to function overridden in c++. In c++ we use virtual key word in the base class but
in java by default this facility is available we donot need to use the virtual keyword.
Method overridden means when the superclass and the subclass has the same method named and we call the
method with the object of the subclass the method within the subclass is called.*/

class Base{
   private int x=1;
    public void disp(){
        System.out.println("The value of x is " + x);
    }
}
class Derived extends Base{
    private int y=2;
    @Override
    public void disp(){
        System.out.println("The value of y is " + y);
    }

}
public class Main {
    public static void main(String[] args) {
        Derived obj;
        obj= new Derived();
        obj.disp();
    }
}