package com.third;
/* Interface; is a keyword just as class
Differece between class and interface:
class vairables can be either private, public,default, protected, static, final.
Methods can be either private, public,default, protected, static, final.
but In interfact: variables are always public static final and methods are always public abstract.
It means interface is like a abstract class where variables are public static final.
Using the interface we can implement multiple inheritance in java which is ohterwise not possible.
Just like abstract class we cannot make object of the interface.
 */
interface A {
     int x=10;  // By default x is public static and final
    void disp(); // By default disp is abstract and public
}
class Derived implements A {
     public void disp(){
        System.out.println("The value of x is " +x);
    }
}
public class FIle3 {
    public static void main(String[] args){
        Derived obj;
        obj= new Derived();
        obj.disp();
    }
}
