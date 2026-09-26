interface i1{
    int count = 12;
    void first();
}
interface i2{
    void first(String msg);
}
public class myInterface implements i1, i2{
    // ERROR -> attempting to assign weaker access privileges; was public
    // void first(){
    //     System.out.println("First Method Called");
    // }

     public void first(){
         System.out.println("First Method Called");
     }

    public void first(String msg){
        System.out.println("First Method Called with mesage: " + msg);
    }
    public static void main(String[] args){
        myInterface obj = new myInterface();
        // obj.first();
        obj.first("HelloWorld");
        // obj.count = 10;
    }
}

/*
Interfaces cannot have instance variables. All fields are public static final (constants) by default.

Interfaces cannot have constructors because they cannot maintain state.

Prior to Java 8, interfaces could only have method signatures (without implementations).

Interfaces cannot have instance methods unless marked as default or static (Java 8+).

All methods are public by default.
*/