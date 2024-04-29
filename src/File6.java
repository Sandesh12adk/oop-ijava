package com.sixth;
/* super() function can be used to pass the value to the constructor of the base class.
Note: You should know that when base class and the derived class both has their own constructor when
we create the object of the base class the constructor of the both classes are invoked.
 */
class A{
    private int  a;
    A(int x){
        a= x;
    }
    public void disp(){
      System.out.println(a);
    }
}
class B extends A {
    int b;
    B(int y, int x){
        super(x);
        b=y;
    }
    public void disp(){
        System.out.println(b);
        super.disp();
    }
}

public class File6 {
    public static void main(String[] args){
        B obj;
        obj= new B(1,2);
        obj.disp();
    }
}
