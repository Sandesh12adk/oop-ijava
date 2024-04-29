package com.second;
/*Abstract class
IN java abstract class is that class which has at least one abstract method. Abstract method is that method
which has the defination but no implementation. in c++ we equoit the mehotd to 0 but we dont do so here.
both the abstract class and the method should have the 'abstract' keyword.
 */
abstract class Base{
      abstract void disp(int x);
}
class Derived1 extends Base{
    @Override
    void disp(int x){
        System.out.println(x);
    }

}
public class File2 {
    public static void main(String[] args){
        Derived1 obj= new Derived1();
        obj.disp(4);
    }

}
