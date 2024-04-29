/* Here we go now its time for threading
Baki kaam garain paryo bich bich ma tyo kaam pani vai rakhyos vanne hisab ley use garne threading
 */
import java.lang.Thread;
class A extends Thread{
    private int a;
    A(int a){
        this.a= a;
    }
    public void run() {
        for (int i = 0; i < a; i++) {
            System.out.println("This is the info from class A " + i);
        }
        System.out.println("Exit from class A");
    }
        public void hi(String str){
            System.out.println(str);
        }
}
class B extends Thread{
    private int a;
    B(int a){
       this.a= a;
    }
    public void run(){
        for(int i=0; i<a; i++){
            System.out.println("This is the info from class B"+i);
        }
        System.out.println("Exit from class B");
    }
}
public class file7 {
    public static void main(String[] args){
        A obja;
        B objb;
        obja= new A(5);
        objb= new B(5);
        obja.start();
        objb.start();
        obja.hi("Sandesh");
        System.out.println("HI");
        for (int i = 0; i < 20; i++) {
            System.out.println("load " + i);
        }
    }
}
