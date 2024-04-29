package com.fourth;
// Checking if method in the base class can excess the private member of the base class when it is
// invoked through the object of the derived class.
class A{
    private int a=5;
    public void disp(){
        System.out.println(a);
    }
}
class B extends A {
}
public class File4 {
    public static void main(String[] args){
        B obj;
        obj= new B();
        obj.disp();
    }

}
