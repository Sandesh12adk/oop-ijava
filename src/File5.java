package com.fifth;
// Keyword super first use
// -> Super keyword is used to excess the members of the super class(Base class) without making the object
// of that class i.e super class`s object.
class A{
     int a;
    public void disp(){
        System.out.println(a);
    }
}
class B extends A{
    private int a;
    B(int x, int y){
        a=x;
        super.a=y;
    }
    public void disp(){
        System.out.println(a);
    }
    public  void message(){
        disp();
        super.disp();

    }
}

public class File5 {
    public static void main(String[] args){
        B obj;
        obj= new B(1,2);
        obj.message();
        obj.disp();
       // super.disp(); This is error because
        // The super keyword can only be used within
        // an instance method or a constructor of a subclass to call a
        // method or access a field from the superclass. You cannot use super in
        // a static context like the main method. which means not even in a subclass
        //if the method is static
    }
}
