public class MethodOverloadingBasic{
    /*void print(char ch){
        System.out.println("Print-CH " + ch);
    }*/
    void print(short ch){
        System.out.println("Print-SHORT " + ch);
    }
    void print(byte ch){
        System.out.println("Print-BYTE " + ch);
    }
    void print(int ch){
        System.out.println("Print-INT " + ch);
    }
    void print(float ch){
        System.out.println("Print-FLOAT " + ch);
    }
    void print(double ch){
        System.out.println("Print-DOUBLE " + ch);
    }
    void print(long ch){
        System.out.println("Print-LONG " + ch);
    }
    public static void main(String ar[]){
        MethodOverloadingBasic obj = new MethodOverloadingBasic();
        //byte b = 10;
        obj.print('a');
        // print(10,10); // ERROR -> reference to print is ambiguous
    }
    static void print(int a, float b) {
        System.out.println("int, float : " + a + " " + b);
    }
    static void print(float a, int b) {
        System.out.println("float, int : " + a + " " + b);
    }
}


//Widening
//char->int->long->float->double
//10->int
//10L->long->float->long
//10.0->double
//10.0f->float->double
//byte->short->int->long->float