import java.util.Scanner;
class P{
    int p_a;
    P(){
        System.out.println("Parent Default");
    }
    {
        System.out.println("Parent Instance Block-1");
    }
    P(int p_a){
        this.p_a = p_a;
        System.out.println("Parent Parameterized");
    }
    {
        System.out.println("Parent Instance Block-2");
    }
    static{
        System.out.println("Parent Static Block-1");
    }
    static{
        System.out.println("Parent Static Block-2");
    }
}
class C extends P{
    int c_a;
    C(){
        System.out.println("Child Default");
    }
    {

        System.out.println("Child Instance Block-1");
    }
    C(int c_a){
        this.c_a = c_a;
        System.out.println("Child Parameterized");
    }
    {
        System.out.println("Child Instance Block-2");
    }
    static{
        System.out.println("Child Static Block-1");
    }
    static{
        System.out.println("Child Static Block-2");
    }
}
public class StaticPrint{
    public static void main(String a[]){
        //P p;
        C c = new C();
        System.out.println("*******************************************");
        C c2 = new C(10);
    }
}
