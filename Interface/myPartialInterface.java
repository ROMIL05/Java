interface interf1{
    int count = 12;
    void first();
}
interface interf2{
    void first(String msg);
}
abstract class myInterfaceBasic implements interf1, interf2{}
class myPartialInterface extends myInterfaceBasic{
    public void first(){
        System.out.println("First Method Called");
    }
    public void first(String msg){
        System.out.println("First Method Called with message: " + msg);
    }
    public static void main(String[] args){
        myPartialInterface obj = new myPartialInterface();
        obj.first();
        obj.first("HelloWorld");
        //obj.count = 10;
    }
}